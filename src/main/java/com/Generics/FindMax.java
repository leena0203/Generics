package com.Generics;

import java.util.Scanner;

public class FindMax<T extends Comparable<T>> {
	T a,  b,  c;
	/**
	 * Constructor
	 * @param a
	 * @param b
	 * @param c
	 */
	public FindMax(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * Generic class UC3
	 * @return
	 */
	public T maximum() {
		return maximum(a, b, c);
	}


	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;                   // assume a is initially the largest

		if (b.compareTo(max) > 0)
			max = b;                // b is the largest so far

		if (c.compareTo(max) > 0)
			max = c;                // c is the largest

		return max;                // returns the largest object
	}                               
}
