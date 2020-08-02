package com.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		driver.get("https://www.google.com/");
		
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assertion is a kind of validation which validate if our expected output is correct.
		// Lets say I might get amazon.com instead of google.com so I validate it if the expected output is correct
		// using assertion. We have Assert class
		
		Assert.assertEquals(title, "Google", "title is not matched");

	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		
		
		Assert.assertTrue(b);
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
