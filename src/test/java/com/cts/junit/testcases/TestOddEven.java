package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junitday1.OddOrEven;

public class TestOddEven {
	OddOrEven val=new OddOrEven();
	public int input;
	@Test
	public void testEvenOdd() {
		//fail("Not yet implemented");
		input=2;
		assertTrue(val.evenOdd(input));
	}
	@Test
	public void TestOddEven() {
		input=5;
		assertFalse(val.evenOdd(input));
	}

}
