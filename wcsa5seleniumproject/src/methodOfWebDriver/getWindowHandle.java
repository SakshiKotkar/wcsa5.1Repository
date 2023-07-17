package methodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omaya.blogspot.com/");
		Thread.sleep(2000);
		String  parenthandle = driver.getWindowHandle();
		System.out.println("Address of Parent Window :"+parenthandle);
		
		driver.findElement(By.partialLinkText("open popup window")).click();
		Thread.sleep(2000);
		
		Set<String> allhandels = driver.getWindowHandles();		

	}

}
