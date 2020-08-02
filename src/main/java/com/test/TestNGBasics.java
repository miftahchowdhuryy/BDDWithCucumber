package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

/*
  
@BeforeSuite -- Setup System Property for Chrome
@BeforeTest -- Launch Browser
@BeforeClass -- Login To App
@BeforeMethod -- Enter URL
@Test -- Google Logo Test
@AfterMethod -- Logout From App
@BeforeMethod -- Enter URL
@Test -- Google Title Test
@AfterMethod -- Logout From App
@BeforeMethod -- Enter URL
@Test -- Search Test
@AfterMethod -- Logout From App
@AfterClass -- Close Browser 
@AfterTest -- Delete All Cookies

*/

public class TestNGBasics {
	// Pre-conditions annotations -- starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite -- Setup System Property for Chrome");
	}
	
	@BeforeTest // rowNum
	public void launchBrowser() {
		System.out.println("@BeforeTest -- Launch Browser");
	}
	
	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass -- Login To App");
	}
	
	
	/*
	 * @BeforeMethod -- Enter URL
	 * 
	 * @Test -- Google Logo Test
	 * 
	 * @AfterMethod -- Logout From App
	 * 
	 * @BeforeMethod -- Enter URL
	 * 
	 * @Test -- Google Title Test
	 * 
	 * @AfterMethod -- Logout From App
	 * 
	 * @BeforeMethod -- Enter URL
	 */
	
	
	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod -- Enter URL");
	}
	
	@Test // 5
	public void googleTitleText() {
		System.out.println("@Test -- Google Title Test");
	}
	

	@Test 
	public void searchText() {
		System.out.println("@Test -- Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test -- Google Logo Test");
	}
	
	// post conditions -- starting with @After
	
	@AfterMethod // 6
	public void logOut() {
		System.out.println("@AfterMethod -- Logout From App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close Browser ");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- Delete All Cookies");
	}

}
