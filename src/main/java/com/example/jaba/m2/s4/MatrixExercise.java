/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s4;

import java.util.Arrays;

/**
 * Exercise on two-dimensional array
 */
public class MatrixExercise {
	/**
	 * <ol>
	 * <li>Create a two line matrix
	 * <ul>
	 * <li>Row 1: "ciao", "buongiorno"
	 * <li>Row 2: "hello", "good morning"
	 * </ul>
	 * <li>Print the first English greeting
	 * <li>Convert the Italian greetings in a string and print it
	 * <li>Convert the full matrix in a string and print it
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {

		// 1
		String[][] saluti = { //
				{ "ciao", "buongiorno" }, //
				{ "hello", "good morning" } };

		// 2
		System.out.println(saluti[1][0]);

		// 3
		System.out.println(Arrays.toString(saluti[0]));

		// 4
		System.out.println(Arrays.deepToString(saluti));

		System.out.println("Done");
	}
}
