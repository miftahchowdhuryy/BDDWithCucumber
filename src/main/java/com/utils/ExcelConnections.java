package com.utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			FileInputStream fis = new FileInputStream("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/src/main/java/excel/data.xlsx");
			
			  
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			//String c = s.getRow(1).getCell(3).getStringCellValue();
			
			for(int i = 2; i<=s.getLastRowNum(); i++) {
				
				String c = s.getRow(i).getCell(1).getStringCellValue();
				System.out.println(c);
				System.out.println();
				
				
			}
			
			
			
			
			
			
		
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
