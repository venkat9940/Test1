package com.cts.testing.callbacks;

public class Calculator {
	
	public double dollarToRupee(double dollar) {
		if (dollar==0)
			return 0;
		else
			return 75.6*dollar;
	}
}
