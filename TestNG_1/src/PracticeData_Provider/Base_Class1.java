package PracticeData_Provider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Base_Class1 {
	public String BaseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;


	@BeforeSuite
	public void Launching() {
		System.out.println("launching browser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseUrl);

	}

	@DataProvider
	public Object[][] LoginCred(){
		Object[][] cred = new Object[3][2];
		cred[0][0]="admin";
		cred[0][1]="admin123";

		cred[1][0]="admin";
		cred[1][1]="admin123";

		cred[2][0]="admin";
		cred[2][1]="admin123";

		return cred;
	}
	@Test(dataProvider="logincred")
	public void A_Login(String username , String pass) throws InterruptedException{
		Thread.sleep(4000);
	
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();

	}

	@AfterTest
	public void Closed() {
		driver.close();
	}

}
