package domain;

import java.util.ArrayList;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		if(this.data == null){
			return false;
		}
		if(this.data.equals(data)){
			return true;
		}
		if(this.data.compareTo(data)>0){
			if(this.leftTree == null) return false;
			return this.leftTree.lookup(data);
		}
		if(this.data.compareTo(data)<0){
			if(this.rightTree == null) return false;
			return this.rightTree.lookup(data);
		}
		return false;
	}

	@Override
	public BinarySearchTree addNode(E data) {
		if (this.data.compareTo(data) == 0) {
			return null;
		} else {
			if (data.compareTo(this.data) < 0) {
				if (this.leftTree == null) {
					this.leftTree = new BinarySearchTree<E>(data);
					return (BinarySearchTree) this.leftTree;
				} else {
					return (BinarySearchTree) this.leftTree.addNode(data);
				}
			}
			else {
				if (this.rightTree == null) {
					this.rightTree = new BinarySearchTree<E>(data);
					return (BinarySearchTree) this.rightTree;
				} else {
					return (BinarySearchTree) this.rightTree.addNode(data);
				}
			}
		}
	}



	public boolean removeNode(E data){
		if(data == null){
			throw new IllegalArgumentException("No data?");
		}
		if(this.data == null){
			return false;
		}

		if(this.data.compareTo(data) == 0){
			if(this.leftTree == null && this.rightTree == null){
				this.data = null;
				return true;
			}else{
				if(this.leftTree != null){
					E bigLeft = this.leftTree.searchGreatest();
					this.data = bigLeft;
					boolean successMoment = this.leftTree.removeNode(bigLeft);
					if(successMoment){
						this.leftTree.cleanUp();
					}
					return successMoment;
				}else{
					E smallRight = this.rightTree.searchSmallest();
					this.data = smallRight;
					boolean successMoment2 = this.rightTree.removeNode(smallRight);
					if(successMoment2){
						this.rightTree.cleanUp();
					}
					return successMoment2;
				}
			}
		}else{
			if(this.data.compareTo(data)>0){
				if(this.leftTree != null){
					return this.leftTree.removeNode(data);
				}
			}else if(this.data.compareTo(data)<0){
				if(this.rightTree != null){
					return this.rightTree.removeNode(data);
				}
			}
		}
		return false; // panic
	}
	public void cleanUp(){
		if(this.data != null){
			if(this.leftTree != null){
				if(this.leftTree.data == null){
					this.leftTree = null;
				}else{
					this.leftTree.cleanUp();
				}
			}
			if(this.rightTree != null){
				if(this.rightTree.data == null){
					this.rightTree = null;
				}else{
					this.rightTree.cleanUp();
				}
			}
		}
	}

	public E searchSmallest(){
		if(this.leftTree == null){
			return this.data;
		}else{
			return this.leftTree.searchSmallest();
		}
	}

	public E searchGreatest(){
		if(this.rightTree == null){
			return this.data;
		}else{
			return this.rightTree.searchGreatest();
		}
	}
	@Override
	public ArrayList<E> getPath(E thing){
		if(!this.lookup(thing)) return null;
		ArrayList<E> result = new ArrayList<>();
		if(this.data.compareTo(thing)==0){
			result.add(this.data);
			return result;
		}else{
			result.add(this.data);
			if(this.data.compareTo(thing)>0){
				result.addAll(this.leftTree.getPath(thing));
			}else{
				result.addAll(this.rightTree.getPath(thing));
			}
		}
	return result;}
}


