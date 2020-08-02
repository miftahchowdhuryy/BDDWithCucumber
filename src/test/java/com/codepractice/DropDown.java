package com.codepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en_au.Itsjustunbelievable;

/*In Selenium, the Select class provides the implementation of
the HTML SELECT tag. A select tag provides the helper methods with
select and deselect options. As select is an ordinary class, 
It's created by the keyword new and also specifies the locaton of
web element. 

The following are the most commonly used methods to deal with
a drop down list:

1. First we need to instantiate a select class by passing the web element.

rowNum. Then using the select object we invoke 
	selectByVisibleText() method which  select one of the
	options in a drop-down box.
	It takes a parameter of String which is one of the values of 
	Select element and it returns nothing.

*/


public class DropDown extends CommonClass {
	public static void dropDown() {
		getDriver();
		WebElement element = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(element);
		select.selectByVisibleText("Deals");
		
	
		
		
		
		
	}

}
