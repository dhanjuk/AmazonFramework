package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static Workbook wbook;
	public static Sheet sheet;
	public static Object[][] readdata(String Sheetname) {
		FileInputStream file=null;
		try {
			file=new FileInputStream("C:\\Users\\Jatinder\\eclipse-workspace\\AmazonFramework\\src\\test\\java\\excelsheet\\Details.xlsx");
}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		wbook=WorkbookFactory.create(file);
		}
		catch(IOException a) {
			a.printStackTrace();
		}
		sheet=wbook.getSheet(Sheetname);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		
	}
}