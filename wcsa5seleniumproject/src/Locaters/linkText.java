package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(2000);
        driver.quit();
   }
}
