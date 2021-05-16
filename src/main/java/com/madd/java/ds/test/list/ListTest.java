package com.madd.java.ds.test.list;

import com.madd.java.ds.list.linkedlist.SinglyLinkedList;
import com.madd.java.ds.model.Data;

public class ListTest {
	
	public static void main(String[] args) {
		System.out.println("Testing list. Start");
		SinglyLinkedList<Data> sll = new SinglyLinkedList<Data>();
		sll.remove();
		sll.add(new Data("Item1", 1));
		sll.remove();
		
		sll.add(new Data("Item1", 2));
		sll.add(new Data("Item1", 3));
		sll.add(new Data("Item1", 4));
		sll.add(new Data("Item1", 5));
		
		

		
		// Loop and display all the list
		System.out.println("Testing list. End");
	}

}
