package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		
		// We have two screen are there one background screen and one pop up screen so we have to switch to 
		// pop up window. We can swithc switchTo().alert() which will switch to popup So this particular method
		// will give you one alert class object so I will store in some alert reference.
		// We have to use alert api to handle alert and we have to switch using switchTo().alert() method.
		// driver.swithchTo.alert() which will return one alert class object reference. By using this
		// this reference I can invoke accept(), dismiss(), and getText() method
		// Alert is an interface.
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message!");
		}
		
		else {
			System.out.println("In-correct alert message");
		}
		
		Thread.sleep(2000);
		
		

		alert.accept(); // click on okay
		// alert.dismiss(); // click on cancel
		
		

	}

}
