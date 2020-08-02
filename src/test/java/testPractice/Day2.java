package testPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test (groups = {"Smoke"})
	public void pLoan() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void preRequisite() {
		System.out.println("I will execute first");
	}

}
