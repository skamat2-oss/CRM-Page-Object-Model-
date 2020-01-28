package pageLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepakg.parentClass;

public class CalenderPage extends parentClass {

	public CalenderPage() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
  
	@FindBy(xpath = "//div[@class='rbc-date-cell']") 
	List<WebElement> listofDateElements;
	
	@FindBy (xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement calenderTitle;
	
	
	
	//Actions
	
	
	public String titleCaleneder() {
		
		String bg= calenderTitle.getText();
		return bg;
	}
	
	public void dateCalender() {
		//String hg = prop.getProperty("date");
		for(int i = 0;i<listofDateElements.size(); i++) {
			
			String tr = listofDateElements.get(i).getText();
			
			if(tr.equalsIgnoreCase(prop.getProperty("date")))
			{   
				listofDateElements.get(i).click();
			}
			//String hg = prop.getProperty("date");
			
		}
		
		
	}
	
	
}
