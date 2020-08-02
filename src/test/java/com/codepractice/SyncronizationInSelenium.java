package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncronizationInSelenium {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		//driver.get("https://www.amazon.com/");
		
		// driver.navigate().to("https://jqueryui.com/");
		
		//pageLoadTimeOut first I will define lets say 20 seconds. One of the dynamic wait. 
		// Implicitly wait, explicitly wait and pageLoadTimeOut wait all these are dynamic wait.
		// Dynamic wait - If the page is loaded in 2 seconds rest 18 sec will be ignored. 
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// driver manage the timeout, of implicitly wait is 20 sec
		//Specifies the amount of time the driver should wait when searching for an element 
		// if it is not immediately present.
		// implicit wait -- it is a dynamic/global wait means -- available for all the elements 
		// which are available in a page. Throughout the driver instance this particular page will be 
		// available. Lets say if the driver is interacting with 50 elements it will be applicable with
		// all the element. 
		// Lets say the element was found within 2 second that means the rest 18 sec will be ignored.
		// That is why we call it dynamic wait. 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://www.facebook.com");
		
		// Explicit wait is available in a form by WebDriverWait(driver, timeout) class
		// Explicit wait is for a specific element

	}

}
