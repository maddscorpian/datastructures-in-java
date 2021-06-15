package com.madd.java.util;

public class Utility {
	
	public static void display2DArray(int[][] arr) {
		for (int[] row : arr) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println("");
		}
	}
	
	public static int minValue(int a, int b) {
		return a < b ? a : b;
	}
	
	
	public static void display1DArray(int[] input) {
		
		for (int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

}
