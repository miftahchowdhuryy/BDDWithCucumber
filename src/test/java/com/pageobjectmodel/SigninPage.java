package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SigninPage {
	public WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		// pageFactory is a selenium interface, 
		PageFactory.initElements(driver, this);
		 
		
	}
	
	// which annotaton you are using for for pageobjectmodel class
	
	
	/*
	 * @FindBy(xpath = "//span[contains(text(), 'Hello, Sign in')]") // we have to
	 * give a name of this webelement public WebElement signin; public void
	 * getSignIn() { signin.click(); }
	 * 
	 * 
	 * 
	 * @FindBy(xpath = "//input[@id='ap_email']")
	 * 
	 * // webelement its a selenium interface public WebElement username; public
	 * void getUserName() { username.sendKeys("miftah.chowdhury@yahoo.com"); }
	 * 
	 * @FindBy(xpath = "//input[@id='continue']")
	 * 
	 * public WebElement continueElement; public void getContinue() {
	 * continueElement.click(); }
	 * 
	 * @FindBy(xpath = "//input[@id='ap_password']")
	 * 
	 * public WebElement passwordElement; public void getPassword() {
	 * passwordElement.sendKeys("Black1rowNum3"); }
	 * 
	 * @FindBy (xpath = "//input[@id='signInSubmit']")
	 * 
	 * public WebElement signInElement; public void getSigninPage() {
	 * signInElement.click(); }
	 * 
	 * @FindBy(xpath = "//div[@id='auth-error-message-box']") public WebElement
	 * getErrorElement; public void getErrorMessage() {
	 * 
	 * String string = getErrorElement.getText(); System.out.println(string); }
	 */
	
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	public WebElement dropDownElement;
	
	public void getDropDown() {
		Select select = new Select(dropDownElement);
		select.selectByVisibleText("Alexa Skills");
	
		
		//dropDownElement.click();
		
	}
	

	

}
