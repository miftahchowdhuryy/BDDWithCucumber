package com.codepractice;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends CommonClass {


	public static void mouseHover() {
		
		/*
		 * A mouse hover is also called as hover. Mouse hover action is basically an
		 * action where a user places a mouse over a designated area like a hyperlink.
		 * It can cause some event to get triggered.
		 * 
		 * 1. First I have to instantiate an Action class by 
		 * 		passing the driver instance.
		 * 
		 * rowNum. Then with the actions object, I need to invoke the moveToElements(WebElement target)
		 * 		method which takes WebElement object as an
		 * 		argument. This web element target is any element
		 * 		where the mouse needs to be moved. 
		 * 		Then using this method you should first move to
		 * 		the menu title, and then move to the sub menu
		 * 		item and click it.
		 * 
		 * 3. We can use build () method to complile all the list
		 * 		of actions in into a single step and ready
		 * 		to be performed
		 * 
		 * 4. Now when we have the action class object and the
		 * 		element as well, just invoke perform() method
		 * 		to make a move to the element.
		 * 
		 *
		 * 
		 * 		 
		 * 
		 * 
		 */


		WebDriver driver = getDriver();
		WebElement sourcElement = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement srElement = driver.findElement(By.xpath("//span[contains(text(), 'AmazonSmile Charity Lists')]"));

		Actions action = new Actions(driver);
		// action.moveToElement(sourcElement).perform();
		// srElement.click();

		action.moveToElement(sourcElement).moveToElement(srElement).click().build().perform();


		// how to refresh your page - driver. navigate and refresh
		// navigate has refresh

		driver.navigate().refresh();



	}

}
