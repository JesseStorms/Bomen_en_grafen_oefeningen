package ui;

import domain.BinarySearchTree;
import domain.BinaryTree;

import java.util.ArrayList;

public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		BinarySearchTree<Integer> boom = new BinarySearchTree<Integer>(6);
		boom.addNode(4);
		boom.addNode(8);
		boom.addNode(3);
		boom.addNode(5);
		boom.addNode(7);
		boom.addNode(9);
		boom.addNode(10);
		boom.addNode(11);
		boom.removeNode(9);
		boom.removeNode(11);
		boom.removeNode(6);
		boom.cleanUp();
		printBoomInfo(boom);
//		Uncomment for example
//		conceptThing();
	}

	private static void printBoomInfo(BinarySearchTree<Integer> boom) {
		if (boom == null) System.out.println("Lege boom");
		else {
			boom.printInorder();
			System.out.println();
			System.out.println(boom.lookup(5));
			System.out.println(boom.lookup(9));
			System.out.println(boom.lookup(3));
			System.out.println(boom.lookup(10));
			System.out.println("De grootste waarde uit deze boom = " + boom.searchGreatest());
			System.out.println("De kleinste waarde uit deze boom = " + boom.searchSmallest());
			ArrayList<Integer> thing = boom.getPath(7);
			for (Integer stuff : thing) {
				System.out.print(stuff);
			}
		}
	}
	private static void printInfo(BinarySearchTree<String> boom){
		if(boom==null) System.out.println("empty?");
		else{
			boom.printPreOrder();
		}
	}
	private static void conceptThing(){
		BinarySearchTree<String> lol = new BinarySearchTree<String>("B");
		lol.addNode("A");
		BinarySearchTree newRoot = lol.addNode("C");
//		now C is the new root
		newRoot.addNode("A").addNode("Q");
		newRoot.addNode("B");
		newRoot = newRoot.addNode("NewTop");
		newRoot.addNode("Q");
		newRoot.addNode("B");
		newRoot.addNode("A");
		newRoot.addNode("C");
		newRoot.printPreOrder();
		newRoot = newRoot.addNode("ArrayStuff");
		System.out.println("\n=========");
		BinaryTree finalNew = null;
//		tree.addNode() returns BinaryTree[2], left and right respectively
		for (BinaryTree root : newRoot.addNode("LeftTree", "RightTree")) {
			finalNew = root.addNode("Subleft", "SubRight")[0].addNode("Node");
		}
		newRoot.printPreOrder();
		finalNew.addNode("A");
		for(BinaryTree newNode : finalNew.addNode("A", "B")){
			if(newNode == null){
				System.out.println("\nthis should appear first, the left branch already has data thus [0] == null");
			}else{
				System.out.println("this is not null");
			}
		}
		finalNew.printPreOrder();
		System.out.println("\n=========");
		System.out.println("preorder print:");
		printInfo(lol);
	}
}
