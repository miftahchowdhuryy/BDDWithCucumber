package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		// how to launch browser
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		driver.get("https://www.amazon.com/");
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		// dynamic wait.
		// basically it is a global wait for all the element in the webpage. Lets say some cases the page is fully
		// loaded, however some of the element which is not and I want that specific element in this case it will
		// throw no element found exception
		// Once the page is fully loaded we are telling selenium please wait next 30 sec to perform the action in specific 
		// element. But its not compulsary to wait until 30 sec. Lets say if the element found in 30 sec the rest 
		// 28 second will be ignored. 
		
		// if I put thread.sleep(30) second then it is a hard wait not dynamic in nature
		// it means everytime it is going to wait 20 sec. Two disadvantage the script will be pause
		// for 20 sec. static wait 
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
      
        
	}
	
	

}
