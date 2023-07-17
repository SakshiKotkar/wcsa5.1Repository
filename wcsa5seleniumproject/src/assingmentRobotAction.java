import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.annotation.Target;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class assingmentRobotAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 
		 driver.findElement(By.id("denyBtn")).click();
		 
		 Actions act= new Actions(driver);
		 
		 WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		 act.moveToElement(target).perform();
		 
		 
		 WebElement target2= driver.findElement(By.name("format-detection"));
		 
		 act.moveToElement(target2).perform();
		 
		 for(int i=0; i<6; i++)
		 {
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		 }
		 Thread.sleep(4000);
		 
		 Robot robot = new Robot(); 
		   robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_C);
		  	
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			
			driver.findElement(By.id("search_query_top_elastic_search")).click();
			
			
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			  	
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				if(driver.findElement(By.xpath("//span[text()='1 Designd']")).isDisplayed())
				{
					Thread.sleep(2000);
					driver.quit();
				}
				else
				{
					System.out.println("Exeption!");
					
				}	 
		 
	}

}
