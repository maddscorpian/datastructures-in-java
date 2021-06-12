package com.madd.java.ds.tree;

import com.madd.java.ds.model.TreeNode;

import lombok.Data;

@Data
public class BinaryTree {

	TreeNode<Integer> root;

	private TreeNode<Integer> addRecursive(TreeNode<Integer> current, Integer value) {
		if (current == null) {
			return new TreeNode<Integer>(null, null, value);
		}

		if (value < current.getData()) {
			current.setLeft(addRecursive(current.getLeft(), value));
		} else if (value > current.getData()) {
			current.setRight(addRecursive(current.getRight(), value));
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(Integer value) {
		root = addRecursive(root, value);
	}

	public void addOld(Integer i) {
		// if this is the first element.

		TreeNode<Integer> node = new TreeNode<Integer>(null, null, i);
		if (root == null) {
			root = node;
		}

		TreeNode<Integer> temp = root;

		while (true) {
			if (temp.getData() > node.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(node);
					break;
				} else
					temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(node);
					break;
				} else {
					temp = temp.getRight();
				}
			}
		}
	}

	public void displayInOrder(TreeNode<Integer> node) {
		// Left Root Right
		if (node != null) {
			displayInOrder(node.getLeft());
			System.out.print(" " + node.getData());
			displayInOrder(node.getRight());
		}

	}

	public void displayPreOrder(TreeNode<Integer> node) {
		if (node != null) {
			System.out.print(" " + node.getData());
			displayInOrder(node.getLeft());
			displayInOrder(node.getRight());
		}

	}

	public void displayPostOrder(TreeNode<Integer> node) {
		if (node != null) {
			
			displayInOrder(node.getLeft());
			displayInOrder(node.getRight());
			System.out.print(" " + node.getData());
		}

	}

}
