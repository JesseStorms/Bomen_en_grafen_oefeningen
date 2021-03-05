package ui;

import domain.BinarySearchTree;

import java.util.ArrayList;

public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		BinarySearchTree<Integer> boom = new BinarySearchTree<Integer>(6);
		BinarySearchTree<String> lol = new BinarySearchTree<String>("C");
		lol.addNode("B");
		lol.addNode("A");
		lol.addNode("A");
//		boom.addNode(4);
//		boom.addNode(8);
//		boom.addNode(3);
//		boom.addNode(5);
//		boom.addNode(7);
//		boom.addNode(9);
//		boom.addNode(10);
//		boom.addNode(11);
//		boom.removeNode(9);
//		boom.removeNode(11);
//		boom.removeNode(6);
		boom.cleanUp();

		printInfo(lol);

		
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
			boom.printInorder();
		}
	}
}
