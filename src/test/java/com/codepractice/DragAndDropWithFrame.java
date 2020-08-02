package com.codepractice;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.lu.a;

public class DragAndDropWithFrame {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://jqueryui.com/");
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Droppable')]")).click();
		
		
		// first I have to make sure if the particular webpage has any frame, we can find out by going to
		// view page source and using control F command in a search box we can search frame. IF any frame is there
		// it will pop up in a iframe tag. Since there is a frame we have to to handle this frame so in order to 
		// interact with frame object i have to come in the particular frame from the webpage so we can perform
		// action
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions action = new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		// to perform drag and drop 
		// how d you handle drag and drop?
		action.dragAndDrop(from, to).build().perform();
		
		// switch to parent frame to child frame
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//a[contains(text(), 'Resizable')]")));
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(), 'Resizable')]")).click();
		
		// stale element reference exception it means switch to either we are not in right frame
		// timeoutexception means sycronization problem
		// difference between fluent and explicit wait
		// no such element exception that means locator is wrong so we need to find the write locator 
		
		// assertion error in to the console
		// out of memory exception 
		
		try {
			ScPractice.ss(driver, "Drag");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


}
