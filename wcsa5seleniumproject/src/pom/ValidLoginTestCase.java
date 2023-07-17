package pom;

import java.io.FileNotFoundException;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws FileNotFoundException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		
		
		LoginPage lp = new LoginPage(driver);
	    lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}
}
