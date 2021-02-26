package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
		super(data, leftTree, rightTree);
	}
			
	public BinarySearchTree(E data) {
		super(data);
	}

	public boolean lookup(E data) {
		if(this.data.equals(data)){
			return true;
		}
		if(this.data == null){
			return false;
		}
		if(this.data.compareTo(data)>0){
			return this.leftTree.lookup(data);
		}
		if(this.data.compareTo(data)<0){
			return this.rightTree.lookup(data);
		}
		return false;
	}

	@Override
	public boolean addNode(E data) {
		if (this.data.compareTo(data) == 0) {
			return false;
		} else {
			if (data.compareTo(this.data) < 0) {
				if (this.leftTree == null) {
					this.leftTree = new BinarySearchTree<E>(data);
					return true;
				} else {
					return this.leftTree.addNode(data);
				}
			}
			else {
				if (this.rightTree == null) {
					this.rightTree = new BinarySearchTree<E>(data);
					return true;
				} else {
					return this.rightTree.addNode(data);
				}
			}
		}
	}





	public boolean removeNode(E data){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchSmallest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public E searchGreatest(){
		throw new UnsupportedOperationException("Not yet implemented");
	}
}


