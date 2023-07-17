package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestoneframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.bluestone.com/");
		   
		   //handle hidden division popup
		   driver.findElement(By.id("denyBtn")).click();
		   Thread.sleep(2000);
		   
		   
		//   WebElement frameElement = driver.findElement(By.xpath("Thread.sleep(2000)"));
		   
		   //Handle the frame by switch the control to frame
		   driver.switchTo().frame("fc_widget");
		   WebElement chatBox = driver.findElement(By.id("chat-icon"));
		   chatBox.click();
//		   driver.findElement(By.id("chat-icon")).click();
//		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(null)))  
		   driver.switchTo().defaultContent();
        driver.findElement(By.id("chat-fc-name")).sendKeys("Sakshi Kotkar");
		  driver.findElement(By.id("chat-fc-email")).sendKeys("sakshi.h.kotkar@gmail.com");
	   driver.findElement(By.id("chat-fc-phone")).sendKeys("9359032211");
	   
//		   driver.findElement(By.className("fc-button")).click();
//		   ////div[contains(@class='d-hotline h-btn animated zoomIn faster eager-load')]
		   
	}

}
