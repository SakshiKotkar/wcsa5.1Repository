package readExcellData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcell {
	public static String main(String[] args) throws EncryptedDocumentException, IOException {
		//Read data from IPL sheet
		//Implementation of read the dtaa from excel
		
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the 
	Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	Sheet Sheet = wb.getSheet("IPL");//get into the sheet.
	Row row = Sheet.getRow(10);//Get into the desired row
	Cell cell = row.getCell(2);//get into the desired call/column.
	 String data = cell.getStringCellValue();//read the data from cell	
	System.out.println(data);
	}
	public void getLastRowCount(String excelPath,String sheetName)
	{
		FileInputStream fis = new FileInputStream(excelPath)
	}
	
	


}
