package com.madd.java.ds.algoexpert;

public class BSTTraverse {
	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		int val = travers(tree, target);

		return val;
	}

	private static int travers(BST tree, int target) {
		// TODO Auto-generated method stub

		if (tree.value > target) {
			if (tree.left == null) {
				return tree.value;
			}
			travers(tree.left, target);
		} else {
			if (tree.right == null) {
				return tree.value;
			}
			travers(tree.right, target);
			
		}
		return 0;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

}
