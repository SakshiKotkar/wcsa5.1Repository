package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// its a web elment repository
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pssTB1;
  	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
  	
  	//initialisation
  	public LoginPage(WebDriver driverWebDriver,driver)
  	{
  	PageFactory.initElements(driver,this);
  	}
//	public LoginPage(WebElement usnTB, WebElement pssTB, WebElement loginButton) {
//		super();
//		this.usnTB = usnTB;
//		this.pssTB1 = pssTB;
//		this.loginButton = loginButton;
	}
	
  	
  	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}
	public void setUsnTB(WebElement usnTB) {
		this.usnTB = usnTB;
	}
	public WebElement getPssTB() {
		return pssTB1;
	}
	public void setPssTB(LoginPage pssTB) {
		this.pssTB1 = pssTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public WebElement getPssTB1() {
		return pssTB1;
	}
	public void setPssTB(WebElement pssTB) {
		this.pssTB1 = pssTB;
	}


	public void validLoginMethod(String readPropertyData, String readPropertyData2) {
		
		// TODO Auto-generated method stub
		
	}
  	
  	//opration
	
	
	
 

}
