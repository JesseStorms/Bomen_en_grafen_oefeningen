package domain;

public class BinaryTree<E> {
	private E data;
	private BinaryTree<E> leftTree, rightTree;
	
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
	
	public void printPreorder(){
			System.out.print(this.data + " ");
			if (this.leftTree != null) this.leftTree.printPreorder();
			if (this.rightTree != null) this.rightTree.printPreorder();
	}
	public void printInOrder(){
		if (this.leftTree != null) this.leftTree.printInOrder();
		System.out.print(this.data + " ");
		if (this.rightTree != null) this.rightTree.printInOrder();
	}
	public void printPostOrder(){
		if (this.leftTree != null) this.leftTree.printPostOrder();
		if (this.rightTree != null) this.rightTree.printPostOrder();
		System.out.print(this.data + " ");
	}
	public int getNodes(){
		int result = 1;
		if(this.leftTree==null && this.rightTree==null){
			return result;
		}
		else{
			if (this.leftTree != null){
				result = result+this.leftTree.getNodes();
			}
			if (this.rightTree != null){
				result = result+this.rightTree.getNodes();
			}
		}
	return result;
}

	public int getDepth(){
		int result = 1;
		if(this.leftTree==null && this.rightTree==null){
			return result;
		}else{
			if(this.leftTree!=null && this.rightTree!=null){
				return Math.max(result+this.leftTree.getDepth(),result+this.rightTree.getDepth());
			}
			if (this.leftTree != null){
				return result+this.leftTree.getDepth();
			}
			if (this.rightTree != null){
				return result+this.rightTree.getDepth();
			}
		}
	return result;
	}
	public boolean isLeaf(){
		return this.leftTree == null && this.rightTree == null;
	}

}
