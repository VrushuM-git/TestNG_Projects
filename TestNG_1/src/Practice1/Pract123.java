package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pract123 {
	public String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
	
 @Test
 public void  A_Launchingbrowser()
 {
	 	System.out.println("launching chrome browser");
	 	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.get(baseUrl);
	 	String expectedtitle = "Administration Login";
	 	String actualtitle = driver.getTitle();
	 	Assert.assertEquals(expectedtitle,actualtitle);
 }
 @Test
 public void B_close()
 {
	 driver.close();
	 	
	 }
}
