package com.cts.junitday1;

public class Pallendrome {
	
	public boolean getPallendrome(String input) {
		 input = input.toLowerCase().replaceAll("\\s+", "");
		 int length = input.length();
		    for (int i = 0; i < length / 2; i++) {
		        if ( input.charAt(i) != input.charAt(length - 1 - i)) {
		            return false;
		        }
		    }
		    return true;
	}
}
