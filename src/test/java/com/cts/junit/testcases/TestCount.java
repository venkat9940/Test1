package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junitday1.NumerCount;

public class TestCount {
 NumerCount count=new NumerCount();
 public int number;
	@Test
	public void testNumberCount() {
		//fail("Not yet implemented");
		number=12345;
		int expected=5;
		assertEquals(expected, count.numberCount(number));
	}
	@Test
	public void testNumberCount1() {
		//fail("Not yet implemented");
		number=0;
		int expected=1;
		assertEquals(expected, count.numberCount(number));
	}

}
