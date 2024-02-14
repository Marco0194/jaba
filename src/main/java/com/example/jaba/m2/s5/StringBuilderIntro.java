/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s5;

import java.util.Arrays;

/**
 * Introduction to StringBuilder
 */
public class StringBuilderIntro {
	public static void main(String[] args) {
		// a single character
		char c = 'x';
		System.out.println(c);

		// Create a mutable string, and then change it
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", Tom!");

		// Create a String from a StringBuilder
		String v = sb.toString();
		System.out.println(v);
		System.out.println("---");
		int[] numeri = { 5, 9, 14 };
		System.out.println(Arrays.toString(numeri));

	}
}
