package com.codepractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScPractice {
	
		public static void ss (WebDriver driver, String s) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File(s + ".png"));
		FileUtils.copyFile(file, new File("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/Screenshoot/" + s +".png"));
		
		
		
		
	
		
		
	}
}
