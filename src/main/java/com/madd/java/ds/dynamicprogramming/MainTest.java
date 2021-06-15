package com.madd.java.ds.dynamicprogramming;

import java.time.Duration;
import java.time.Instant;

import com.madd.java.util.Math;

public class MainTest {

	public static void main(String[] args) {
		
		
		
		
		int n = 5;
		Instant start = Instant.now();
		
		Math math = new Math();

		System.out.println("Factorial of "+n+" = " + math.factorialDyanamicProgramming(n));
		Instant finish = Instant.now();

		System.out.println(
				"Time taken in seconds for dynamic programming " + Duration.between(start, finish).toMillis() / 1000);

		start = Instant.now();

		System.out.println("Factorial of "+n+" = " + math.factorialReccursion(n));
		finish = Instant.now();

		System.out.println(
				"Time taken in seconds for reccurrsiong " + Duration.between(start, finish).toMillis() / 1000);

	}

}
