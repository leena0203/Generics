package com.Generics;

import java.util.Scanner;

public class FindMax {
//	/**
//	 * UC1
//	 * 
//	 * @param a
//	 * @param b
//	 * @param c
//	 * @return
//	 */
//	public static Integer findMaxInt(Integer a, Integer b, Integer c) {
//		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
//			return a;
//		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
//			return b;
//		else
//			return c;
//	}
//
//	/**
//	 * UC2
//	 * 
//	 * @param a
//	 * @param b
//	 * @param c
//	 * @return
//	 */
//	public static Float findMaxFloat(Float a, Float b, Float c) {
//		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
//			return a;
//		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
//			return b;
//		else
//			return c;
//	}
//
//	/**
//	 * UC3
//	 * 
//	 * @param a
//	 * @param b
//	 * @param c
//	 * @return
//	 */
//	public static String findMaxString(String a, String b, String c) {
//		if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
//			return a;
//		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
//			return b;
//		else
//			return c;
//
//	}
//
//	
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
	    T max = a; // assume x is initially the largest

	    if (b.compareTo(max) > 0)
	      max = b; // y is the largest so far

	    if (c.compareTo(max) > 0)
	      max = c; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum
}
