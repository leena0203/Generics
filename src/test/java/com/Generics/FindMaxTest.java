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

}
