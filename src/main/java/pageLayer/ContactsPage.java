package pageLayer;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basepakg.parentClass;

public class ContactsPage extends parentClass {

	public ContactsPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//div[contains(@class,'mb5')]")
	WebElement title;
	
	@FindBy(xpath="//div[@class='ui fitted read-only checkbox']//label")
	WebElement checkbox1;
	
	@FindBy(xpath="//div[contains(@class,'ui fitted')]//label")
	WebElement checkbox2;
	
	@FindBy (xpath="//td[contains(@class,'right aligned')]/child::div//button")
	WebElement deletecontact2;
	
	
	/*@FindBy(xpath="//div[@id='dashboard-toolbar']/child::div//div[@class='ui loader']")
	WebElement title;
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/child::div//div[@class='ui loader']")
	WebElement title;
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/child::div//div[@class='ui loader']")
	WebElement title;*/
	
	//Actions
	public void checkboxTick() {
		Actions action = new Actions(driver);
		action.moveToElement(checkbox1).click().build().perform();
		
	}
	
	public String getTitle() {
		String ravi=title.getText();
		return ravi;
	}
	
	public void checkboxTick2() {
		Actions action = new Actions(driver);
		action.moveToElement(checkbox2).click().build().perform();
		
	}
	
	/*public void deleteContact() throws Exception  {
		//deletecontact2.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", deletecontact2);
		//WebDriverWait wait = new WebDriverWait(driver, 10 );
        //wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1500);
        Alert delete = driver.switchTo().alert();
		delete.accept();
		
	}*/
	
	
	
	
}
