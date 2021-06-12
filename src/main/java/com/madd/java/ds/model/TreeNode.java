package com.madd.java.ds.model;

import lombok.Data;

@Data
public class TreeNode<T> {
	
	TreeNode<T> left;
	TreeNode<T> right;
	T data;
	
	public TreeNode(TreeNode<T> left, TreeNode<T> right, T data) {
		this.left = left;
		this.right = right;
		this.data = data;
		
	}

}
