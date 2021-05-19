package com.madd.java.ds.test.list;

import com.madd.java.ds.exception.NoDataException;
import com.madd.java.ds.list.linkedlist.SinglyLinkedList;
import com.madd.java.ds.model.Data;

import java.util.LinkedList;

public class ListTest {
	
	public static void main(String[] args) {
		System.out.println("Testing list. Start");
		SinglyLinkedList<Data> sll = new SinglyLinkedList<Data>();
		sll.insertFirst(new Data("Item1", 1));
		
		sll.insertFirst(new Data("Item1", 2));
		sll.insertFirst(new Data("Item1", 3));
		sll.insertFirst(new Data("Item1", 4));
		sll.insertFirst(new Data("Item1", 5));
		sll.insertLast(new Data("Item1", 6));
		sll.insertLast(new Data("Item1", 7));
		try {
			Data data = sll.deleteFirst();
			while (data != null) {
				System.out.println("Data " + data.getValue());
				data = sll.deleteFirst();
			}
		}catch (NoDataException e){
			System.out.println("No more data. " + e.getMessage());
		}
		// Loop and display all the list
		System.out.println("Testing list. End");
	}

}
