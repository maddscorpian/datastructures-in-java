package com.madd.java.ds.test.stack;

import com.madd.java.ds.model.Data;
import com.madd.java.ds.stack.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		System.out.println("Testing Stack. Start");
		// Create a stack of size X. 
		Stack<Data> stack = new Stack<Data>(2);
		Data d = stack.pop();
		// Add 3 elements to the stack. 
		stack.push(new Data("Item1", 1));
		stack.push(new Data("Item2", 2));
		stack.push(new Data("Item3", 3));
		// pop and then add.
		d = stack.pop();
		stack.push(new Data("Item3", 3));
		// check the size of the stack. 
		System.out.println("Size of the stack is - " + stack.getSize());
		
		System.out.println("Testing Stack. End");
	}

}
