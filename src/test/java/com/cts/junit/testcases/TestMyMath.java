package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junitday1.MyMath;

public class TestMyMath {
	MyMath util= new MyMath();
	@Test
	public void testAdd() {
		int a=12;
		int b=13;
		int expected= 12+13;
		int actual=util.add(12, 13);
		assertEquals(expected, actual,0);
		
	}

}
