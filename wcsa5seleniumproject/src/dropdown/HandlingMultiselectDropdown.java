package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/driver.chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/Multiple%20dropdown.HTML");
		
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		
		// To select using index value
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		//to select this using visible text
		sel.selectByVisibleText("pani puri");
		Thread.sleep(1000);
		
		//to select by this using by value
		sel.selectByValue("v5");
		Thread.sleep(1000);
		
		//to deselect by the using index value
	   sel.deselectByIndex(1);
	   Thread.sleep(1000);
	   
	    // to deselect by using Visible text
	   sel.deselectByVisibleText("pani puri");
	   Thread.sleep(1000);
	   
	   // to deselect by using value
	   sel.deselectByValue("v5");
	   Thread.sleep(1000);
	   
	   //To Select all using value
	   for(int i=0; i<5; i++)
	   {
		   sel.selectByIndex(i); 
	   }
	   Thread.sleep(1000);
	   
	   //To Deselect All option using value
	   for(int i=0; i<5; i++)
	   {
		   sel.deselectByIndex(i);
	   }	   
	}
}
