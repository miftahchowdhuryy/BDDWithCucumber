package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();
		
		// to go to specific webpage
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		
		// get data from excel file
		Xls_Reader reader = new Xls_Reader("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/src/main/java/com/testdata/HalfEbayTestData.xlsx");
		

		
		String firstname = reader.getCellData("RegTestData", "firstname", 2 );
		String lastname = reader.getCellData("RegTestData", "lastname", 2 );
		String address1 = reader.getCellData("RegTestData", "address1", 2 );
		String address2 = reader.getCellData("RegTestData", "address2", 2 );
		String city = reader.getCellData("RegTestData", "city", 2 );
		String state = reader.getCellData("RegTestData", "state", 2 );
		String zipcode = reader.getCellData("RegTestData", "zipcode", 2 );
		String emailaddress = reader.getCellData("RegTestData", "emailaddress", 2 );
		
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
		
		driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
		driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailaddress);
		
		
		
	
		
		
		

	}

	
	

}
