package com.Generics;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax<T extends Comparable<T>> {
	public T[] arguments;
	/**
	 * Constructor
	 * UC4
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
		printMax(maximum);
		return maximum;
	}
	
	/**
	 * UC4
	 * @param <E>
	 * @param varibles
	 * @return
	 */
	public static <T extends Comparable<T>> T maximum(T ...varibles) {
		Arrays.sort(varibles);
		return varibles[varibles.length - 1];
	}
	
	/**
	 * UC5
	 */
	public static <T> void printMax(T element) {
		System.out.println("Maximum : " + element);
	}
}                               

