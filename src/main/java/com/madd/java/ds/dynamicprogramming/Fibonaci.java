package com.madd.java.ds.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Fibonaci {
	public static int CNT = 0;
	public static List<Integer> fibs = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("Calculating ");
		int n = 10;
		System.out.println("Receursion. Fibonaci of " + n + " = " + Fibonaci.fib(n) + " Loops = " + CNT);
		CNT = 0;
		System.out.println("Receursion. Fibonaci of " + n + " = " + Fibonaci.fibDP(n) + " Loops = " + CNT);

	}

	public static int fib(int n) {
		CNT++;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static int fibDP(int n) {

		// Do the calculation if the value is not already present in the store. 
		if (n >= fibs.size()) {
			// index not exists
			// Initialize the first to elements of the list.
			if (fibs.size() == 0) {
				fibs.add(0);
			}
			if (fibs.size() == 1) {
				fibs.add(1);
			}

			for (int i = 2; i <= n; i++) {
				CNT++;
				fibs.add(fibs.get(i - 1) + fibs.get(i - 2));
			}
		}

		return fibs.get(n);

	}

}
