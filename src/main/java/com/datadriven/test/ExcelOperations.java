package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {
	public static void main(String[] args) {
		 
			
		// get data from excel file
		
		Xls_Reader reader = new Xls_Reader("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/src/main/java/com/testdata/HalfEbayTestData.xlsx");
		
		// reader.addSheet("HomePage");
		
		// check if any particular sheet exist or not. If exist then add it if not exist then add it
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}
		
		// how many column are in any particular sheet
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println(colCount);
		
		// how many rows are in any particular sheet
		
		int rowCount = reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		
	
	}

}
