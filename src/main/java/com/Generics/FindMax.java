package com.Generics;

import java.util.Scanner;

public class FindMax {
	
	
//	 static Scanner integer = new Scanner(System.in); 
//	 static int a =integer.nextInt(); 
//	 static int b = integer.nextInt(); 
//	 static int c = integer.nextInt();
	
	
	public static Integer findMaxInt(Integer a, Integer b, Integer c) {
		if (a.compareTo(b) > 0 && a.compareTo(c)> 0)
		return a;
		else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
			return b;
		else return c;
	}

	
//	 public static void main(String[] args) 
//	 { System.out.println("Integer Max: " +findMaxInt(a, b, c)); }
	 

}
