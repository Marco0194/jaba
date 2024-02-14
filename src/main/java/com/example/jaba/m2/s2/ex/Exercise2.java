/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s2.ex;

/**
 * Another very simple exercise on array
 */
public class Exercise2 {
	/**
	 * <li>(1) define an array of char where the elements represent your name
	 * <li>(2) print the array length
	 * <li>(3) print the first and the last character in it
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// 1
		char[] name = { 'M', 'A', 'R', 'C', 'O' };
		System.out.println(name);

		// 2
		System.out.println(name.length);

		// 3
		System.out.println(name[0]);
		System.out.println(name[name.length - 1]);

		System.out.println("Done");
	}
}
