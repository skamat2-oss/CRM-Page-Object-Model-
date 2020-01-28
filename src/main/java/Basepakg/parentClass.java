package Basepakg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class parentClass {

		public static WebDriver driver;
		public static Properties prop;
		//public String s;
public parentClass() throws IOException {
	String s = System.getProperty("user.dir");
	prop = new Properties();
	FileInputStream fp = new FileInputStream(s+"\\src\\main\\java\\propertiesLayer\\conf.properties");
	prop.load(fp);
	//System.out.println(prop.getProperty("browser"));	
	}

public static void there() {
	//String st = System.getProperty("user.dir");
	String brwser = prop.getProperty("browser");
	if(brwser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();	
	}
	else {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\gecko\\geckodriver.exe");
    driver = new FirefoxDriver();  //launch browser
	}
	driver.manage().window().maximize();
	 //  driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.SECONDS);
	   //driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
}

}
