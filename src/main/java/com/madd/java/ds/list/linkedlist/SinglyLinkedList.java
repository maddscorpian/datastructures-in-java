package com.madd.java.ds.list.linkedlist;

import com.madd.java.ds.exception.NoDataException;
import com.madd.java.ds.model.Data;
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
	public T deleteFirst() throws NoDataException{
		System.out.println("deleteFirst");
		if (head == null){
			throw new NoDataException("End of data Structure. No more data.");
		}
		T data = head.getData();
		head = head.getNext();
		return data;
	}
	
	public void insertLast(T data) {
		System.out.println("insertLast");
		// Save for reference. 
		Node<T> current  = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		Node<T> node = new Node<T>();
		node.setData(data);
		current.setNext(node);
		current = null;
		//head = node;
	}

	public void insertAfter(T data){
		// First find the node for that data.
	}
}
