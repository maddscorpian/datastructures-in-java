package com.madd.java.ds.list.linkedlist;

import com.madd.java.ds.model.Node;

public class SinglyLinkedList<T> {
	private Node<T> f = null;

	public void add(T data) {
		System.out.println("Adding to List");
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(f);
		f = node;
	}

	public Node<T> remove() {
		System.out.println("Removing from list");
		if (null == f) {
			System.out.println("List is empty. Returning null");
			return null;
		}
		Node<T> node = f;
		f.setNext(f.getNext());
		return node;
	}

}
