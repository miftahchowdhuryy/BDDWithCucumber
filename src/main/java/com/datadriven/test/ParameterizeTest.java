package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

// What is data driven mean? -- interview question
// Data Driven Approach (Parameterization) -- used to create data driven framework, driving the test data from excel file or other file.

public class ParameterizeTest {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver84");
		driver = new ChromeDriver();

		// to go to specific webpage
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=rowNum943&ru=");

		// get data from excel file
		Xls_Reader reader = new Xls_Reader("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/src/main/java/com/testdata/HalfEbayTestData.xlsx");
		int rowCount  = reader.getRowCount("RegTestData");
		
		//create a column in excel
		reader.addColumn("RegTestData", "Status");


		//parametarization
		for(int rowNum = 2; rowNum <= rowCount; rowNum++) {
			
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum );
			String lastname = reader.getCellData("RegTestData", "lastname", rowNum );
			String address1 = reader.getCellData("RegTestData", "address1", rowNum );
			String address2 = reader.getCellData("RegTestData", "address2", rowNum );
			String city = reader.getCellData("RegTestData", "city", rowNum );
			String state = reader.getCellData("RegTestData", "state", rowNum );
			String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum );
			String emailaddress = reader.getCellData("RegTestData", "emailaddress", rowNum );


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
			
			//set data cell,  write a particular data in a particular row and column cell 
			reader.setCellData("RegTestData", "Status", rowNum, "Pass");


		}

	}

}
