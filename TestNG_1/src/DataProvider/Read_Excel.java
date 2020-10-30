package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Read_Excel(String excelPath){
		try
		{
			File src = new File(excelPath);
			FileInputStream Fis = new FileInputStream(src);
			wb = new XSSFWorkbook(Fis);
			
		}
	
	catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetnumber, int row, int column){
		sheet = wb.getSheetAt(0);
		String Data = sheet.getRow(row).getCell(column).getStringCellValue();
		return Data;
	}
	public int getRowCount(int sheetIndex){
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row +1;
		return row;
	}
}


