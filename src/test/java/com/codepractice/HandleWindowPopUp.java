package com.codepractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	
	static WebDriver driver;
	
	//1. alerts -- JavaScript Pop Up -  Alert API (accept, dismiss)
	//2. File Upload pop up -- Browser Button (type = file, sendKeys(path)
	//3. Browser Window PopUp - Advertisement pop up (windowHandler API getWindowHadnles())

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #1')]")).click();
		
		Thread.sleep(2000);
		
		// how to maximize a window
		driver.manage().window().maximize();
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// selenium.NoSuchwindowException
		
		// Returns:
			// A set of window handles which can be used to iterate over all open windows.
		Set<String>handler = driver.getWindowHandles();
		
//		Returns an iterator over the elements in this set.
		Iterator<String >  it = handler.iterator();
		

		String parentWindow = it.next();
		
		System.out.println("Parent ID: " + parentWindow);
		
		String childWindow = it.next();
		System.out.println("Child ID: " + childWindow);
		
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Titile: " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Titile: " + driver.getTitle());
		
		
		
		
		
		

	}

}
