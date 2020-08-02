package testPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void webLoginCarLoan() {
		// selenium
		System.out.println("WebLoginHome");
	}
	
	@Test (groups = {"Smoke"})
	public void mobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void loginAPICarLoan() {
		// Rest API automation
		System.out.println("RestApiLoginHome");
	}

}
