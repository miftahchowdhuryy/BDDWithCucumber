package com.codepractice;

public class RefreshPage extends CommonClass {
	
	/*
	 * This is the inbuilt method for performing page refresh operation provided by
	 * Selenium web driver. This command is the most commonly used command across
	 * test automation for performing a page refresh operation. Refresh command can
	 * be used in a simple way as mentioned below.
	 */
	
	
	public static void getRefreshAPage() {
		getDriver();
		driver.navigate().refresh();
		
	}

}
