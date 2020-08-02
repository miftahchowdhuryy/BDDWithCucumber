package com.test;

import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	// important interview question
	

	
	/*
	 * @Test(invocationTimeOut = rowNum000) 
	 * public void infiniteLoopTest() { 
	 * int i = 1;
	 * while(i ==1) { 
	 * System.out.println(i); 
	 * } 
	 * }
	 */
	
	
	// if you want to handle exception in TestNG what is the keyword
	// expectedExceptions keyword where we have to provide the expectedExceptions class
	
	@Test (expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
	
	@Test
	public void testrowNum() {
		System.out.println("pass");
	}

}
