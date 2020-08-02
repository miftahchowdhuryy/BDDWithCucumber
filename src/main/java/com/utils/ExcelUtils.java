package com.utils;

import java.io.IOException;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public ExcelUtils (String excelPath, String sheetName) {
		try {
			// XSSFWorkbook: Represents workbook in xlsx file.
			// Create reference for workbook
			
			wb = new XSSFWorkbook(excelPath);
			
			// Create references of Worksheet
			sheet = wb.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
}
	
	
	public static int getRowCount() {
		
			// Call row count function
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: " + rowCount);
			return rowCount;
		
	}
	
	public static int getColumnCount() {
		
		// Call column count function
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of rows: " + columnCount);
		return columnCount;
	
	}
		
		public static String getCellDataString(int rowNum, int colNum) {
		// call cell count function 
		String cellCount = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellCount);
		return cellCount;
	
	}
	
	public static void getCellDataNumber(int rowNum, int colNum) {
		// call cell count function 
		double cellCount = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellCount);
	
	}
	
}
