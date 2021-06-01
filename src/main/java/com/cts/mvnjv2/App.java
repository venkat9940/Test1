package com.cts.mvnjv2;

import com.cts.junitday1.MyMath;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
    	MyMath x= new MyMath();
        System.out.println( "Hello World!" );
		int value=x.add(12, 13);
		System.out.println(value);
    }
}
