package Flib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenFramework.Flib;

public class genericReusableMethods {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("file:///C:/Program%20Files%20(x86)/actiTIME/actitime/userguide/index.html");
		//Read data from IPL sheet
		//Implementation of read the data from excel
		Flib flib = new Flib();
		driver.findElement(By.name("Username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("loginButton")).click();
	}
}
		
//	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the 
//	Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
//	Sheet Sheet = wb.getSheet("IPL");//get into the sheet.
//	Row row = Sheet.getRow(10);//Get into the desired row
//	Cell cell = row.getCell(2);//get into the desired call/column.
//	 String data = cell.getStringCellValue();//read the data from cell
//	System.out.println(data);
//	}
//	private CharSequence readExcelData(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public void getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream fis = new FileInputStream(excelPath);
//		 Workbook wb = WorkbookFactory.create(fis);
//		 Sheet sheet = wb.getSheet(sheetName);
//	
		
//	}
//
//}
