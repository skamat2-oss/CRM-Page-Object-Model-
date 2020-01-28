package testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Basepakg.parentClass;
import pageLayer.CalenderPage;
import pageLayer.ContactsPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.PostsPage;

public class CalenderTest extends parentClass{
	HomePage homepage;
	PostsPage postspage;
	ContactsPage contactspage;
	LoginPage loginpage;
	CalenderPage calenderpage;
	

	public CalenderTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void beginMethods() throws IOException, InterruptedException
	{ there();
		 loginpage= new LoginPage();
		homepage= loginpage.loginDetails(prop.getProperty("usn"), prop.getProperty("pswd"));
		Thread.sleep(2000);
		//contactspage= homepage.gotoContacts();
		calenderpage = homepage.gotoCalender();
		Thread.sleep(2000);
		
	}
	
	
	@Parameters({"URL"})
	@Test
	public void testMethod(String sexykadu)
	{
		
		System.out.println(sexykadu);
	}
	
	@Test (groups= {"kadu"})
	public void titleTest() {
		String bh=calenderpage.titleCaleneder();
		Assert.assertEquals(bh, "Calendar");
		
	}
	
	@Test
	public void dateTest() {
		calenderpage.dateCalender();
		
		
	}

}
