package domain;

import java.util.ArrayList;

public class BinaryTree<E>{
	E data;
	BinaryTree<E> leftTree, rightTree;
	
	public BinaryTree(E data){
		this(data,null,null);
	}
	
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data= data;
		this.leftTree= leftTree;
		this.rightTree= rightTree;
	}
	
	public void printInorder(){
			if (this.leftTree != null) this.leftTree.printInorder();
			System.out.print(this.data + " ");
			if (this.rightTree != null) this.rightTree.printInorder();
	}
	public void printPreOrder(){
		System.out.print(this.data + " ");
		if (this.leftTree != null) this.leftTree.printPreOrder();
		if (this.rightTree != null) this.rightTree.printPreOrder();
	}
	public String getData(){
		return this.data.toString();
	}


	//*ONDERSTAANDE METHODES NIET IMPLEMENTEREN! DEZE MOETEN GEIMPLEMENTEERD WORDEN IN DE domain.BinarySearchTree file!*//
	boolean lookup(E data) {
		throw new UnsupportedOperationException("Should not be implemented, implement in domain.BinarySearchTree file");
	}

	public BinaryTree addNode(E data) {
		throw new UnsupportedOperationException("Should not be implemented, implement in domain.BinarySearchTree file");
	}

	public BinaryTree[] addNode(BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		BinaryTree[] result = new BinaryTree[2];
		try {
			if(this.leftTree != null && this.rightTree != null){
				return result;
			}
			if(this.leftTree == null){
				this.leftTree = leftTree;
				result[0] = leftTree;
			}
			if(this.rightTree == null){
				this.rightTree = rightTree;
				result[1] = rightTree;
			}
		}catch (Exception e){
			return result;
		}
		return result;
	}
	public BinaryTree[] addNode( Object leftTree, Object rightTree) {
		if(this.leftTree != null && this.rightTree != null){
			throw new IllegalArgumentException();
		}
		return this.addNode(new BinarySearchTree((Comparable) leftTree), new BinarySearchTree((Comparable) rightTree));
	}

	boolean removeNode(E data){
		throw new UnsupportedOperationException("Should not be implemented, implement in domain.BinarySearchTree file");
	}

	E searchSmallest(){
		throw new UnsupportedOperationException("Should not be implemented, implement in domain.BinarySearchTree file");
	}

	E searchGreatest(){
		throw new UnsupportedOperationException("Should not be implemented, implement in domain.BinarySearchTree file");
	}

	protected void cleanUp() {
	}
	protected ArrayList<E> getPath(E data){
		return null;
	}
}
