package com.cts.junitday1;

public class NumerCount {

	public int numberCount(int number) {
		 int count = 0;
		 if (number==0) {
			 count++;
		 }
		    while (number != 0) {
		      // number = number/10
		      number /= 10;
		      ++count;
		    }

		    return count;
		  }
	}

