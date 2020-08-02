package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps extends Base {
	SigninPage sp;
	
	// connection only goes to given
	@Given("^Go to home page$")
	public void go_to_home_page() {
		getDriver();
		sp = PageFactory.initElements(driver, SigninPage.class);
	    
	   
	}

	@When("^Enter Username$")
	public void enter_Username() {
	    //sp.getSignIn();
	    //sp.getUserName();
	    //sp.getContinue();
		
		sp.getDropDown();
	
	    
	}

	@When("^Enter password$")
	public void enter_password() {
	   // sp.getPassword();
	    
	}

	@When("^Click on Submit button$")
	public void click_on_Submit_button() {
	    
	   // sp.getSigninPage();
		 // sp.getErrorMessage();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() {
	    // we are using assertclass for verification which is a testng class
		
		Assert.assertEquals(driver.getTitle(), "AAAmazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	  
	}



}
