package com.madd.java.ds.list.linkedlist;

import com.madd.java.ds.model.Node;

public class SinglyLinkedList<T> {
	
	private Node<T> head = null;
	
	// Insert first 
	public void insertFirst(T data) {
		System.out.println("insertFirst");
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	// delete first
	public T deleteFirst(){
		System.out.println("deleteFirst");
		Node<T> temp = head;
		head = head.getNext();
		return temp.getData();
	}
	
	public void insertLast(T data) {
		System.out.println("insertLast");
		// Save for reference. 
		Node<T> current  = head;
		while(current.getNext() != null) {
			current.setNext(current.getNext());
		}
		Node<T> node = new Node<T>();
		node.setData(data);
		current.setNext(node);
		current = null;
		//head = node;
	}
	

	
		
}
