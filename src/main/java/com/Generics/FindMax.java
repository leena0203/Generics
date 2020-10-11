package com.Generics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax<T extends Comparable<T>> {
	public T[] arguments;
	/**
	 * Constructor
	 * @param a
	 * @param b
	 * @param c
	 */
	public FindMax(T ...arguments) {
		this.arguments = arguments;
	}
	/**
	 * Generic class UC3
	 * @return
	 */
	public T maximum() {
		T maximum = maximum(arguments);
		return maximum;
	}


	public static <E extends Comparable<E>> E maximum(E ...varibles) {
		Arrays.sort(varibles);
		return varibles[varibles.length - 1];                
	}                               
}
