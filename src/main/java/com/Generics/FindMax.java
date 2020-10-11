package com.Generics;

import java.util.Scanner;

public class FindMax {
	/**
	 * UC1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static Integer findMaxInt(Integer a, Integer b, Integer c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;
	}

	/**
	 * UC2
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static Float findMaxFloat(Float a, Float b, Float c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;
	}

	/**
	 * UC3
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static String findMaxString(String a, String b, String c) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
			return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else
			return c;

	}

}
