package MethodsOfWebElememts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clerMethod {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(null);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElements(By.name(""))).sendKeys("admin");
		
		
	}

}
