package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTestWithDataProvider {
	WebDriver driver;
	
	@BeforeMethod // PreCondition
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//what is syncronizaton - sometimes our code/automation script run faster than the code then the issue comes, inoorder to overcome the issue we have to ues implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//getTestData will fetch data from the excel file by using apche poi api
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
		
	}
	
	@Test(dataProvider = "getTestData")
	public void halfEbayRegPageTest(String firstname, String lastname, String address1, String address2, 
										String city, String state, String zipcode, String emailaddress) {
		
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);;

		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);

		driver.findElement(By.xpath("//input[@id='address1']")).clear();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);

		driver.findElement(By.xpath("//input[@id='address2']")).clear();;
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);

		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

		WebElement element = driver.findElement(By.xpath("//select[@id='state']"));
		Select select = new Select(element);
		select.selectByVisibleText(state);

		driver.findElement(By.xpath("//input[@id='zip']")).clear();
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcode);

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);

//		driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
//		driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailaddress);
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod // postCondition
	public void tearDown() {
		driver.quit();
	}

}
