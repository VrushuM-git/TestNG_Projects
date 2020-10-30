package TestNG_POS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POS_return {
	public String baseUrl = "http://localhost/POS/public/login";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
	@Test(priority=1)
	public void A_Login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//input[@name='loginButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();

	}

	@Test(priority=2)
	public void Return() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[2]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();


	}
	@Test(priority=3)
	public void Receipt() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[2]/input[1]")).click();
		//String text =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[2]/input[1]")).getText();
		//System.out.println(text);	
	}
	@BeforeTest

	public void Launchbrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}


	@AfterTest
	public void afterTest() {
		//	driver.close();
	}
}