package DataProvider;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DataProvider1 {
	public String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
	public static Select dropdown;

	@BeforeSuite
	public void LaunchingBrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		//("webdriver.chrome.driver",driverPath );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	@DataProvider
	public Object[][] LoginCredentials(){ //Array of Array Object 
		//created two dim arry with 4 rows and two coln


		Object[][] cred= new Object[4][2];

		cred[0][0] = "admin";
		cred[0][1] = "admin1234";


		cred[1][0] = "admin123";
		cred[1][1] = "admin123";


		cred[2][0] = "admin123";
		cred[2][1] = "admin";


		cred[3][0] = "admin";
		cred[3][1] = "admin1234";
		
		return cred; //it helps in printing obj data
	}
	@Test(dataProvider="LoginCredentials")
	public void A_Login(String Useid ,String Pass) throws InterruptedException{

		Thread.sleep(4000);
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-username")).sendKeys(Useid);
		driver.findElement(By.id("input-password")).sendKeys(Pass);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
	}
	//	public int add(int a, int b){
	//		int c = a+b; // mathematical computation
	//		return c;
	//	}
	
	@AfterTest 
	public void Closed(){
		driver.close();
	}

}