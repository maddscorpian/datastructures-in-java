package com.madd.java.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
	private int top;
	private List<T> collection = new ArrayList<T>();
	private int STACK_SIZE;
	
	public Stack(int STACK_SIZE) {
		this.STACK_SIZE = STACK_SIZE;
		top = -1;
	}

	public void push(T data) {
		if (top + 1 >= STACK_SIZE) {
			System.out.println("Stack is full.");
			return;
		}
		collection.add(data);
		top++;
		System.out.println("Stack Current Size = " + this.getSize() + " Stack Max Size = " + STACK_SIZE);
	}
	
	public T pop() {
		if (top <=-1) {
			System.out.println("Stack is empty");
			return null;
		}
		top--;
		return collection.get(top);
	}
	
	public int getSize() {
		return top + 1;
	}
}
