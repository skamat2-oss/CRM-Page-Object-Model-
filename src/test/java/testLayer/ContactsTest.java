package testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepakg.parentClass;
import pageLayer.ContactsPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.PostsPage;

public class ContactsTest extends parentClass{
	HomePage homepage;
	PostsPage postspage;
	ContactsPage contactspage;
	LoginPage loginpage;
	
	public ContactsTest() throws IOException {
		super();
	}
	
	 @BeforeTest
	 public void getThere() throws IOException, InterruptedException {
		 there();
		// homepage = new HomePage();
		 loginpage= new LoginPage();
		homepage= loginpage.loginDetails(prop.getProperty("usn"), prop.getProperty("pswd"));
		Thread.sleep(2000);
		 contactspage= homepage.gotoContacts();
		 Thread.sleep(2000);
	 }
	
	 @Test
	 public void getCheckboxTick() throws InterruptedException {
		 //Thread.sleep(6000);
		 contactspage.checkboxTick();
	 }
	 
	 @Test(groups = {"kadu"})
	 public void titleTest() throws InterruptedException {
		 //Thread.sleep(6000);
		 String dj = contactspage.getTitle();
		 Assert.assertEquals(dj, "Contacts");
	 }
	
	 @AfterTest
	 public void tearDown() {
		 driver.close();
	 }
	
	
	

}
