package actionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMoveToElementMethod {
     public static void main(String[] args) {
    	 System.setProperty("WebDriver.Chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.bluestone.com/");
		   
	}
}
