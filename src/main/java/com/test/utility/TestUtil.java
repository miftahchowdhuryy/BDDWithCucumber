package com.test.utility;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.examples.NewLinesInCells;

import com.excel.utility.Xls_Reader;

import net.bytebuddy.asm.Advice.Return;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<>();
		
		try {
			reader = new Xls_Reader("/Users/miftahchowdhury/eclipse-workspace/firstMavenProject/src/main/java/com/testdata/HalfEbayTestData.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int rowNum = 2; rowNum <=reader.getRowCount("RegTestData"); rowNum++) {
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			String city = reader.getCellData("RegTestData", "city", rowNum);
			String state = reader.getCellData("RegTestData", "state", rowNum);
			String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
			String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
			
			Object object [] = { firstName, lastname, address1, address2, city, state, zipcode, emailAddress};
			myData.add(object);
			
		}
		
		return myData;
		
		
	}

	


}
