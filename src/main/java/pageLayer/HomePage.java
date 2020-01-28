package pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepakg.parentClass;

public class HomePage extends parentClass {

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Contacts activity stream')]")
	WebElement contactsHeader;

	@FindBy(xpath="//div[@id='top-header-menu']/child::div[@class='right menu']//span")
	WebElement usernameDisplay;
	
	@FindBy(xpath="//div[@id='main-nav']/child::a[3]")
    WebElement contactsLink;
	
	@FindBy(xpath="//div[@id='main-nav']/child::a[2]")
    WebElement CalenderLink;
	
	@FindBy(xpath = "//div[@id='main-nav']/child::a[6]")
	WebElement PostLink;
	
//Actions
	
	public String getcontHeader() {
		return contactsHeader.getText();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getUsername() {
		return usernameDisplay.getText();
	}
	
	public ContactsPage gotoContacts() throws IOException {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public PostsPage gotoPosts() throws IOException {
		PostLink.click();
		return new PostsPage();
	}
	
	public CalenderPage gotoCalender() throws IOException {
		CalenderLink.click();
		return new CalenderPage();
	}
}





