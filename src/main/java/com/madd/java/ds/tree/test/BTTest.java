package com.madd.java.ds.tree.test;

import com.madd.java.ds.tree.BinaryTree;

public class BTTest {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    System.out.println("Root Node = " + bt.getRoot().getData());
	    System.out.println("In Order Traverse");
		bt.displayInOrder(bt.getRoot());
		System.out.println("");
	    System.out.println("Pre Order Traverse");
		bt.displayPreOrder(bt.getRoot());
		System.out.println("");
	    System.out.println("Post Order Traverse");
		bt.displayPostOrder(bt.getRoot());
	}

}
