package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junitday1.PrimeNumber;

public class TestPrime {
	PrimeNumber prime=new PrimeNumber();

	@Test
	public void isPrime() {
		//fail("Not yet implemented");
		int number=5;
		boolean expeted=true;
		boolean actual=prime.isPrime(5);
		assertEquals(expeted, actual);
	}
	@Test
	public void isNotPrime() {
		//fail("Not yet implemented");
		int number=12;
		boolean expeted=false;
		boolean actual=prime.isPrime(12);
		assertEquals(expeted, actual);
	}
	@Test
	public void evenPrime() {
		int number=2;
		assertFalse(prime.isPrime(number));
	}

}
