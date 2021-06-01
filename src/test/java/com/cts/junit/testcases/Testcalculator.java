package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.testing.callbacks.Calculator;

public class Testcalculator {
	
	Calculator calc=new Calculator();
	@Test
	public void testDollarToRupee() {
		double dollar=12.00;
		double expected=12.00*75.6;
		double actual=calc.dollarToRupee(12.00);
		assertEquals(expected, actual,0);
	}
	@Test
	public void testDollarToRupee1() {
		double dollar=0.00;
		double expected=0.00;
		double actual=calc.dollarToRupee(0);
		assertEquals(expected, actual,0);
	}

}
