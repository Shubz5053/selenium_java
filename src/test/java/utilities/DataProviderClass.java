package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "data")
	public String [][] getData() throws IOException {
		String path =".\\testData\\data.xlsx";
		ExcelUtility xlutil = new ExcelUtility(path);	
		int totaRows = xlutil.getRowCount("Sheet1");
		int totalCols = xlutil.getCellCount("Sheet1",1);
		String loginData[][] = new String[totaRows][totalCols];
		for (int i = 1; i <= totaRows; i++) {   // start from 1
		    for (int j = 0; j < totalCols; j++) {
		        loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
		    }
		}
		return loginData;
		
	}

}
