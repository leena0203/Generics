package com.Generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	public static FindMax test;

	@Test
	void giveMaxNumAtFirstPosition() {
		FindMax<Integer> test = new FindMax<Integer>(10, 5, 3);
		Integer maxNum = test.maximum();
		Integer expec = 10;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtSecondPosition() {
		FindMax<Integer> test = new FindMax<Integer>(6, 12, 3);
		Integer maxNum = test.maximum();
		Integer expec = 12;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtThridPosition() {
		FindMax<Integer> test = new FindMax<Integer>(6, 12, 23);
		Integer maxNum = test.maximum();
		Integer expec = 23;
		assertEquals(expec, maxNum);
			
	}

	@Test
	void giveMaxStringAtFirstPosition() {
		FindMax<String> test = new FindMax<String>("Peach","Banana","Apple" );
		String maxString = test.maximum();
		String expec = "Peach";
		assertEquals(expec, maxString);
			
	}	
	@Test
	void giveMaxStringAtSecondPosition() {
		FindMax<String> test = new FindMax<String>("Banana","Peach","Apple" );
		String maxString = test.maximum();
		String expec = "Peach";
		assertEquals(expec, maxString);
			
	}
	
	@Test
	void giveMaxStringAtThirdPosition() {
		FindMax<String> test = new FindMax<String>("Banana","Apple","Peach" );
		String maxString = test.maximum();
		String expec = "Peach";
		assertEquals(expec, maxString);
	}
	@Test
	void giveMaxFloatAtFirstPosition() {
		FindMax<Float> test = new FindMax<Float>(10.0f, 5.2f,3.1f );
		Float maxNum = test.maximum();
		Float expec = 10.0f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtSecondPosition() {
		FindMax<Float> test = new FindMax<Float>(6.4f, 12.7f,3.0f );
		Float maxNum = test.maximum();
		Float expec = 12.7f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtThridPosition() {
		FindMax<Float> test = new FindMax<Float>(6f, 12.1f,23.9f );
		Float maxNum = test.maximum();
		Float expec = 23.9f;
		assertEquals(expec, maxNum);
			
	}

}
