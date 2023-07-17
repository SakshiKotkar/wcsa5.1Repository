package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toUnderstandOprationalMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/driver.chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/hp/OneDrive/Documents/HTML%20Selenium%20code/Multiple%20dropdown.HTML");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);

		//is multiple method
		boolean result = sel.isMultiple();
		System.out.println(result);

		// getoptions Method
		List<WebElement> DropdownOptions = sel.getOptions();
		for(int i=0; i<DropdownOptions.size(); i++)
		{
			String options = DropdownOptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(1000);
		}
		
		// using for each Loop
		List<WebElement> ops = sel.getOptions();
		for(WebElement we: ops)
		{
			String textOfOps = we.getText();
			System.out.println(textOfOps);
		}
		for(int i=0; i<4; i++)
		{
		sel.selectByIndex(i);	
		}
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("First selected option Is:"+firstOption.getText());
	}

}






