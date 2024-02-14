/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s2.ex;

/**
 * A very simple exercise in three steps on array
 */
public class Exercise1 {
	/**
	 * <li>(1) create an array with "one", "two", "three", "four" in it
	 * <li>(2) print the number of its elements
	 * <li>(3) print the last element
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// 1
		String[] numbers = { "one", "two", "three", "four" };

		// 2
		System.out.println(numbers.length);

		// 3
		System.out.println(numbers[numbers.length - 1]);

		System.out.println("Done");
	}
}
