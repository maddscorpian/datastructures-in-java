package com.madd.java.ds.algoexpert;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.Utilities;

import com.madd.java.util.Utility;

public class MinChangeCoinProblem {

	public int nonConstructibleChange(int[] coins) {
		// Write your code here.
		// Initiate the array.
		// Find the max possible change.
		int maxChange = 0;
		for (int i = 0; i < coins.length; i++)
			maxChange += coins[i];
		// create the coindMap.
		int[][] coinMap = new int[coins.length][maxChange + 2];

		// Fill the map with -1 - Indicate no change.
		// Let us first sort the array.
		Arrays.sort(coins);

		for (int i = 0; i < coinMap.length; i++) {
			for (int j = 0; j < coinMap[i].length; j++) {
				// j=0 its all possible mark as 1.
				if (j == 0) {
					coinMap[i][j] = 1;
				} else {
					// check with coin from 0 ...i can I make the sum j ?
					// If yes save 1 else -1.
					// First we need to check for the smallest coin.

					if (i == 0) { // Single coin.
						if (coins[i] == j) {
							coinMap[i][j] = 1;
						} else {
							coinMap[i][j] = -1;
						}
					} else { // combination of coins.
						// if i >= j copy from previous row.
						if (coins[i] > j) {
							coinMap[i][j] = coinMap[i - 1][j];
						} else {
							int dif = j - coins[i];
							coinMap[i][j] = coinMap[i - 1][dif];

						}

					}
				}
			}
		}

		System.out.println(coinMap.length);
		int res = 0;
		System.out.println(coinMap.length);
		Utility.display2DArray(coinMap);
		for (int i = 0; i < coinMap[coinMap.length -1].length; i++) {
			System.out.print(coinMap[coinMap.length - 1][i]);
			if (coinMap[coinMap.length - 1][i] == -1) {

				res = i;
				break;
			}

		}
		System.out.println(res);

		return -1;
	}

	public static void main(String[] args) {
		MinChangeCoinProblem mcp = new MinChangeCoinProblem();
		int[] coins = { 1, 1, 1, 1, 1 };
		mcp.nonConstructibleChange(coins);
	}

}
