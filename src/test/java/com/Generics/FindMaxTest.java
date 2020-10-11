package com.Generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	public static FindMax test;

	@Test
	void giveMaxNumAtFirstPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.findMaxInt(10, 5, 3);
		Integer expec = 10;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtSecondPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.findMaxInt(6, 12, 3);
		Integer expec = 12;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxNumAtThridPosition() {
		FindMax test = new FindMax();
		Integer maxNum = test.findMaxInt(6, 12, 23);
		Integer expec = 23;
		assertEquals(expec, maxNum);
			
	}

	@Test
	void giveMaxFloatAtFirstPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.findMaxFloat(10.0f, 5.2f, 3.1f);
		Float expec = 10.0f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtSecondPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.findMaxFloat(6.4f, 12.7f, 3.0f);
		Float expec = 12.7f;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	void giveMaxFloatAtThridPosition() {
		FindMax test = new FindMax();
		Float maxNum = test.findMaxFloat(6f, 12.1f, 23.9f);
		Float expec = 23.9f;
		assertEquals(expec, maxNum);
			
	}

}
