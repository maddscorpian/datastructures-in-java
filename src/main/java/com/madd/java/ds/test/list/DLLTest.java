package com.madd.java.ds.test.list;

import com.madd.java.ds.list.linkedlist.DoublyLinkedList;
import com.madd.java.ds.model.Data;

public class DLLTest {
    public static void main(String[] args) {
        System.out.println("Testing DLL. Start");
        DoublyLinkedList<Data> dll = new DoublyLinkedList<Data>();
        dll.insertFirst(new Data("Item1", 1));
        dll.insertFirst(new Data("Item1", 2));
        dll.insertFirst(new Data("Item1", 3));
        dll.insertLast(new Data("Item1", 4));

        Data data = dll.getFront().getData();
        while (null != data){
            System.out.println("Data " + data.getValue());

        }
        System.out.println("Testing DLL. End");
    }
}
