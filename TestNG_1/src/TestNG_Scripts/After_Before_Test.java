


package TestNG_Scripts;

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

public class After_Before_Test {
	public String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void A_Login() {
		driver.findElement(By.id("input-username")).sendKeys("vrushali");
		driver.findElement(By.id("input-password")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//img[@id='button-menu']")).click();
	}
	@Test
	public void B_ClickOnbilling(){
		WebElement billing = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/a[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(billing).click().perform();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebElement invoice = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(invoice).click().perform();
		
	}
	@Test
	public void C_Assert()
	{
		String expectedTitle = "Dashboard";
	  	String actualTitle = driver.getTitle();
	  	Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@BeforeTest
	public void browserlaunch() {
		System.out.println("launching chrome browser");
	  	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
	  	driver = new ChromeDriver();
	  //	driver.manage().window().maximize();
	  	driver.get(baseUrl);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
