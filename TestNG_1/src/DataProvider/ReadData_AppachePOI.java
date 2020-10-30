package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData_AppachePOI {
	
  public static void main(String[] args){
	  
	  try{
		  File src = new File("E:\\selenium_project\\seleniumworkspace\\TestNG_1\\TestData.xlsx");
		  //load file
		  FileInputStream fis = new FileInputStream(src);
		  //load workbook
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  //load sheet
		  XSSFSheet sh1 = wb.getSheetAt(0);
		  System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		  System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		  
		  System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		  System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		  
		  System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		  System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 
	  }
	  catch(Exception e){
		  System.out.println(e.getMessage());
	  }
	  
	  
	  
  }
}
