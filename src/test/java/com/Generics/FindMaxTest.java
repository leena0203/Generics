package com.Generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	public static FindMax test;

	@Test
	void giveMaxNum() {
		FindMax<Integer> test = new FindMax<Integer>(10, 5, 3,14,32);
		Integer maxNum = test.maximum();
		Integer expec = 32;
		assertEquals(expec, maxNum);

	}


	@Test
	void giveMaxString() {
		FindMax<String> test = new FindMax<String>("Peach","Banana","Apple","Kiwi" );
		String maxString = test.maximum();
		String expec = "Peach";
		assertEquals(expec, maxString);

	}	

	@Test
	void giveMaxFloat() {
		FindMax<Float> test = new FindMax<Float>(6.4f, 12.7f,3.0f,96.0f,10001.0f );
		Float maxNum = test.maximum();
		Float expec = 10001.0f;
		assertEquals(expec, maxNum);

	}
}
