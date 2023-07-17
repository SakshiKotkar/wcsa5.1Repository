package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimesynchronization {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http");
		string actualTititleOfLoginPage = driver.getTitle();
		if(actualTitleOfLoginPage.equals(actiTIME - Login ))
		{
			System.out.println("Title is match test case is passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("admin");
			driver.findElement(By.id("loginbutton")).click();
		}
		else
		{
			System.out.println("we will get an Exception");
		}
		string actualTitleOfLoginPage = driver.getTitle();
		if
	}
     
}
