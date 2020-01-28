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

public class HomeTest extends parentClass {
   LoginPage loginpage;
   HomePage homepage;
   ContactsPage contactpage;
   PostsPage postspage;
	public HomeTest() throws IOException {
		super();
	}
	
 @BeforeTest
 public void getThere() throws IOException, InterruptedException {
	 there();
	// homepage = new HomePage();
	 loginpage= new LoginPage();
	homepage= loginpage.loginDetails(prop.getProperty("usn"), prop.getProperty("pswd"));
	 homepage = new HomePage();
	 Thread.sleep(2000);
 }
// @Test
 //public void contactsHeaderTest() {
	// String sg = homepage.getcontHeader();
	 //Assert.assertEquals(sg,"Contacts activity stream");
 //}
 
 @Test
 public void usernameTest() throws InterruptedException {
	 //Thread.sleep(1000);
	 String sg = homepage.getUsername();
	 Assert.assertEquals(sg,"sn kk");
	 //contactpage=homepage.gotoContacts(); 
 }

 @Test(groups= {"kadu"})
 public void CRMTitleTest() throws InterruptedException {
	 //Thread.sleep(1000);
	 String sm = homepage.getTitle();
	 Assert.assertEquals(sm,"Cogmento CRM");
	 //contactpage=homepage.gotoContacts(); 
 }
 
 @Test
 public void Contactspagetest() throws InterruptedException, IOException {
	 //Thread.sleep(1000);
	 contactpage = homepage.gotoContacts();
	 
 }
 
 @Test
 public void Postspagetest() throws InterruptedException, IOException {
	 //Thread.sleep(1000);
	 postspage = homepage.gotoPosts();
	 
 }
 
 
 
 @AfterTest
 public void tearDown() {
	 driver.close();
 }
}
