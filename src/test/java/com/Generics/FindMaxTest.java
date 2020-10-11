package com.Generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	public static FindMax test;

	@Test
	void giveMaxNumAtFirstPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.maximum(10, 5, 3);
		Integer expec = 10;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtSecondPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.maximum(6, 12, 3);
		Integer expec = 12;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtThridPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.maximum(6, 12, 23);
		Integer expec = 23;
		assertEquals(expec, maxNum);
			
	}

	@Test
	void giveMaxStringAtFirstPosition() {
		FindMax test = new FindMax();
		String maxString = test.maximum("Peach","Banana","Apple" );
		String expec = "Peach";
		assertEquals(expec, maxString);
			
	}
	
	@Test
	void giveMaxStringAtSecondPosition() {
		FindMax test = new FindMax();
		String maxString = test.maximum("Banana","Peach","Apple" );
		String expec = "Peach";
		assertEquals(expec, maxString);
			
	}
	
	@Test
	void giveMaxStringAtThirdPosition() {
		FindMax test = new FindMax();
		String maxString = test.maximum("Banana","Apple","Peach" );
		String expec = "Peach";
		assertEquals(expec, maxString);
	}
	@Test
	void giveMaxFloatAtFirstPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.maximum(10.0f, 5.2f, 3.1f);
		Float expec = 10.0f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtSecondPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.maximum(6.4f, 12.7f, 3.0f);
		Float expec = 12.7f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtThridPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.maximum(6f, 12.1f, 23.9f);
		Float expec = 23.9f;
		assertEquals(expec, maxNum);
			
	}

}
