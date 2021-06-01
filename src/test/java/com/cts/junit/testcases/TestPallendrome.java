package com.cts.junit.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.junitday1.Pallendrome;

public class TestPallendrome {
	Pallendrome pallen=new Pallendrome();
	@Test
	public void isPallendrome() {
		String input="787";
	assertTrue(pallen.getPallendrome(input));
		}
	@Test
	public void notPallendrome() {
		String input="sai";
		assertFalse(pallen.getPallendrome(input));
		}
	 @Test
	    public void emptyStringTest() throws Exception {
	       String input = "";
	       assertTrue(pallen.getPallendrome(input));
	    }
	 @Test
	    public void singleCharTest() throws Exception {
	        String input = "M";
	        assertTrue(pallen.getPallendrome(input));
	    }
	  @Test
	    public void multipleWhiteSpaceTest() throws Exception {
	        String input = "A   Santa         at Nasa";
	        assertTrue(pallen.getPallendrome(input));
	    }
}
