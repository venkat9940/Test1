package com.cts.mvnjv2;

import com.cts.testing.callbacks.Calculator;

public class Connection {
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		double val=cal.dollarToRupee(12);
		System.out.println(val);
	}
}
