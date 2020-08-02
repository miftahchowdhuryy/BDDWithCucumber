package com.test;

import java.util.concurrent.TimeUnit;

import javax.annotation.WillClose;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.ca.I;

public class GoogleTest {
	
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
	
	/*
	 * Important interview question 
	 * How do you define your test cases in a sequence manner ? I will provide the
	 * priority keyword after @Test annotation
	 */
	
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() {
		// boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority = 3, groups = "Link Test")
	public void mailingText() {
		boolean b = driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("Test_1");
		
	}
	
	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("Test_2");
	}
	
	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("Test_3");
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
