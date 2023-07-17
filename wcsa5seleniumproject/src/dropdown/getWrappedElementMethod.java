package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/dropdown.HTML");
	    
		// identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		// handle the dropDown
		Select sel = new Select(dropDownElement);
		
		// To read options from DropDown 
		WebElement allOpts = sel.getWrappedElement();
		
		System.out.println(allOpts.getText());
		
	}

}