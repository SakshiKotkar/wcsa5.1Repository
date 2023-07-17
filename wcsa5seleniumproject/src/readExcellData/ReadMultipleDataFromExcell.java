package readExcellData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//Read data from IPL sheet
				//Implementation of read the dtaa from excel
				//Read Multiple values or data from excel sheet by using for loop
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sheet = wb.getSheet("IPL");
      Row row = sheet.getRow(3);
     Cell cell = row.getCell(0);
	     String data=getStringCellValue(10);
	     Thread.sleep(2000);
	     System.out.println(data);
	}

}

