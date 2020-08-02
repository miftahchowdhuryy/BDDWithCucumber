package com.test;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePage() {
		System.out.println("Home Page Test");
	}

}
