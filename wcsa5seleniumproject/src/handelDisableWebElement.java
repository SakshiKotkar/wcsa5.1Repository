import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelDisableWebElement {
	 public static void main(String[] args) {
		
		 System.setProperty("WebDriver.Chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/element.html");
		   
		   driver.findElement(By.id("i1")).sendKeys("admin");
		  driver.findElement(By.id("i2")).sendKeys("maneger");
		   
	}

}
