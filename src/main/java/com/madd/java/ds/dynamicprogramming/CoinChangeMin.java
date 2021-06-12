package com.madd.java.ds.dynamicprogramming;

import com.madd.java.util.Utility;

public class CoinChangeMin {

	public static void main(String[] args) {
		int w = 10;
		int[] d = { 1,5,6,9 };

		// Initialize the array.
		int[][] table = new int[d.length][w + 1];

		System.out.println("Number of rows =  " + table.length);

		for (int i = 0; i < table.length; i++) {
			// Calculate for each row.
			// for column 0, we know all the values are 0. So will will skip it.

			for (int j = 0; j < table[i].length; j++) {
				// First column all the values are 0.
				if (j == 0) {
					table[i][j] = 0;

				} else {
					// Calculate for the first row.
					if (i == 0) {
						table[i][j] = j/d[i];
					} else {
						// For rest of the rows.

						if (j < d[i]) {
							table[i][j] = table[i - 1][j];
						} else {
							// Exclude, include and sum functions now.
							//table[i][j] = table[i - 1][j] + table[i][j - d[i]];
							table[i][j] = Utility.minValue(table[i - 1][j], 1 + table[i][j-d[i]]);
						}
					}
				}
			}

		}
		System.out.println("After calculation");
		Utility.display2DArray(table);

//		int[] arr = new int[10];
//		Arrays.fill(arr, 4);
//		Arrays.setAll(arr, i -> 4);
//		for (int i : arr) {
//			System.out.println(arr[i]);
//		}
	}

}
