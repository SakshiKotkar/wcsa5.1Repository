package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/driver.chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("qspiders");
	  WebElement  usn1 = driver.findElement(By.id("u_0_1_t1"));
	    usn1.sendKeys("Tiger");
	  

	}

}

