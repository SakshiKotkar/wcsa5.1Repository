package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.bluestone.com/");
		// driver.findElement(By.id())
	//WebElement target = driver.findElement(By.partialLinkText("Watch Jewellery"));
	WebElement target =driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
	
	Actions act = new Actions(driver);
	 act.moveToElement(target).perform();
	 
	 act.moveToElement(target).build().perform();
	 
	 driver.findElement(By.xpath("//a[.='Band']")).click();
	
	}
	    

}
