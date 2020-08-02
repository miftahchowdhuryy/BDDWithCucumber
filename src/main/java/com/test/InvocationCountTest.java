package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	// lets say if i want to execute same test, certain times then i use this keyword
	
	@Test(invocationCount = 5)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum is == " + c);
		
	}

}
