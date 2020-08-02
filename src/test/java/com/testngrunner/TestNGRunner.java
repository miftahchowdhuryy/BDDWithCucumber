package com.testngrunner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber annotation
@CucumberOptions(
		features = "Feature",	// features is a keyword to connect feature folder where exactly your feature file is available
		glue="com.stepdefinition" // to connect stepdefinitionpackage, where exactly your step definition file
	) 

public class TestNGRunner extends AbstractTestNGCucumberTests implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Script run successfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = new ChromeDriver();
		TakesScreenshot sc = (TakesScreenshot)driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/Screenshoot" +"error"+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
