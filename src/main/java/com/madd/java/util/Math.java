package com.madd.java.util;

import java.util.ArrayList;
import java.util.List;

public class Math {
	
	public Math() {
		// TODO Auto-generated constructor stub
	}


	public int factorialDyanamicProgramming(int n) {
		List<Integer> factorials = new ArrayList<Integer>();
		// factorial of 0 is 1. 
		factorials.add(1);
		for (int i = 1; i <=n ; i++) {
			factorials.add(i*factorials.get(i-1));
		}
		return factorials.get(n);
	}
	
	
	public  int factorialReccursion(int n) {
		//System.out.println("### + " + n);
		if (n == 1) {
			return 1;
		}
		return n * factorialReccursion(n-1);
	}
	
	
	public static void main(String[] args) {
		Math math = new Math();
		System.out.println(math.factorialReccursion(5));
		System.out.println(math.factorialDyanamicProgramming(5));
		
	}
	
	

}
