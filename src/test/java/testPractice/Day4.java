package testPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeLoan() {
		// selenium
		System.out.println("WebLoginCar");
	}
	
	@Test (dependsOnMethods = "webLoginHomeLoan")
	public void mobileLoginHomeLoan() {
		// Appium
		System.out.println("MobileLoginCar");
	}
	
	@Test (groups = {"Smoke"})
	public void loginAPIHomeLoan() {
		// Rest API automation
		System.out.println("RestApiLogin");
	}

}
