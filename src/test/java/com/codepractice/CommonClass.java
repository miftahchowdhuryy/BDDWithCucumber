package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonClass {
	static WebDriver driver;
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://jqueryui.com/");
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

}
