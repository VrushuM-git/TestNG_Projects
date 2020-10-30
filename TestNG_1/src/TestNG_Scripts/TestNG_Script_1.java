package TestNG_Scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Script_1 {
	public String baseUrl ="http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void A_launchBrowser() {
	  	System.out.println("launching chrome browser");
	  	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
	  	driver = new ChromeDriver();
	  	driver.get(baseUrl);
	  	String expectedTitle = "Administration Login";
	  	String actualTitle = driver.getTitle();
	  	Assert.assertEquals(expectedTitle, actualTitle);
  }
  @Test
  		public void B_close(){
	  	driver.close();
  
  }
}
