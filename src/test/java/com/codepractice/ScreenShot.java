package com.codepractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void screenshot(WebDriver driver, String s) throws IOException {
		
		/*
		 * - TakeScreenShot is an interface and we are using getScreenshotas method to create image file
		 * 
		 * - Casting: Because earlier ChromeDriver() object was hold by WebDriver type i.e. up cast. 
		 * 		TakesScreenshot interface comes down in WebDriver hierarchy. 
		 * 		As we have seen in above program that a up cast object has no visibility 
		 * 		of non-overridden method of sub class. 
		 * 		To capture a screenshot we need to use getScreenshoAs() method of TakesScreenshot interface. 
		 * 		So to use method we must need to down cast to either RemoteWebdriver or TakesScreenshot interface.
		 * 
		 * - Taking screenshot in selenium is a 3 step process
		 * 		1. Down cast webdriver variable to TakeScreenShot
		 * 		
		 * 		rowNum. Invoke getScreenshot method to create a file which will return a file type object.
		 * 
		 * 		3. Invoke copyFile() method of FileUtils class which will copy file to desired location.
		 * 
		 * 
		 * 
		 * 
		 */	
		
		
		
		// 		I have a method name getScreenShotAs which will return a file type object.
		TakesScreenshot sc = (TakesScreenshot)driver;
		File f = sc.getScreenshotAs(OutputType.FILE);
		
		// rowNum. Now copy the screenshot in desired location using copyFile method
		FileUtils.copyFile(f, new File(s+".png"));
		
		
		
	}

	

}
