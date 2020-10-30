package Practice_TNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Pract_TNG1 {
	public String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public static WebDriver driver;
	
  @Test
  public void A_login() {
	  driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("vrushali");
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("vrushali123");
	  driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
	  driver.findElement(By.xpath("//img[@id='button-menu']")).click();
	//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/img[1]")).click();
	 
  }
  @Test
  public void b_billing(){
	  WebElement billing = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/a[1]"));
	  Actions action = new Actions(driver); 
	  action.moveToElement(billing).click().perform();
	  
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  
	  WebElement Invoice = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
	  Actions action1 = new Actions(driver);
	  action1.moveToElement(Invoice).click().perform(); 
	  
}
  @Test
	public void C_Assert()
	{
		String expectedTitle = "Dashboard";
	  	String actualTitle = driver.getTitle();
	  	Assert.assertEquals(expectedTitle, actualTitle);
	}
  
  
   @BeforeTest
  public void Launchbrowser() {
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterTest
  public void Close() {
	  driver.close();
  }

}
