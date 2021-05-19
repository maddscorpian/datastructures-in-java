package com.madd.java.ds.list.linkedlist;

import com.madd.java.ds.model.DNode;
import com.madd.java.ds.model.Node;

public class DoublyLinkedList<T> {
    private DNode<T> front = null;
    private DNode<T> rear = null;

    public DNode<T> getFront() {
        return front;
    }

    public void setFront(DNode<T> front) {
        this.front = front;
    }

    public DNode<T> getRear() {
        return rear;
    }

    public void setRear(DNode<T> rear) {
        this.rear = rear;
    }

    public void insertFirst(T data) {
        System.out.println("insertFirst");

        DNode<T> node = new DNode<T>();
        node.setData(data);
        if (null == front && null == rear){
            // First element to be added.
            front = node;
            rear = node;
            return;
        }
        node.setNext(front);
        front = node;
    }

    public void insertLast(T data) {
        System.out.println("insertLast");

        DNode<T> node = new DNode<T>();
        node.setData(data);
        if (null == front && null == rear){
            // First element to be added.
            front = node;
            rear = node;
            return;
        }
        rear.setNext(node);
        rear = node;
    }

}
