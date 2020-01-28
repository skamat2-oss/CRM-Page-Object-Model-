package testLayer;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepakg.parentClass;
import pageLayer.HomePage;
import pageLayer.LoginPage;

public class LoginTest extends parentClass {
	LoginPage loginpage;
	HomePage homepage;
    parentClass bapu;
public LoginTest() throws IOException {
	super();
}

	@BeforeMethod
	public void begist() throws IOException {
		there();
		loginpage=new LoginPage();
		homepage = new HomePage();
			
	}
	
	@Test(priority = 2 )
	public void loginTest() throws IOException {
		homepage=loginpage.loginDetails(prop.getProperty("usn"), prop.getProperty("pswd"));
		
	}
	
	@Test(priority = 1,groups= {"kadu"})
	public void iconTest() {
		Boolean bg = loginpage.iconDisplayed();
		System.out.println(bg);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
