package pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepakg.parentClass;

public class LoginPage extends parentClass {

	/*public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}*/
	
	@FindBy(xpath="//input[@placeholder='E-mail address']")
	WebElement Emailid;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submit;
	
	@FindBy(xpath="//div[@id='onesignal-bell-container']")
	WebElement notification;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public HomePage loginDetails(String un , String pwd) throws IOException {
		Emailid.sendKeys(un);
		passwd.sendKeys(pwd);
		submit.click();
		return new HomePage();
	}
	
	public boolean iconDisplayed() {
		return notification.isDisplayed();
	}
    
}
