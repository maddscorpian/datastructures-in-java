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

}
