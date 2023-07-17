package Locaters.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleAttribute {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver","./driver/chromdriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
}
