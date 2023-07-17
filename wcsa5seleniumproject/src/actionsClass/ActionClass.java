package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("http://desktop-iig4dfj/login.do");
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.name("LoginForm")).click();
		   
	}

}
