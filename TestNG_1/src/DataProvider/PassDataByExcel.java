package DataProvider;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class PassDataByExcel {
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void Login(String Useid ,String Pass) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://localhost/Logic_Invoice/upload/admin/");
		Thread.sleep(4000);
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-username")).sendKeys(Useid);
		driver.findElement(By.id("input-password")).sendKeys(Pass);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
		Assert.assertTrue(driver.getTitle().matches("Dashboard"),"Invalid credentials");
		System.out.println("login successful");
	}
	@AfterMethod
	void Quit(){
		driver.quit();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed(){
		Read_Excel config = new Read_Excel("E:\\selenium_project\\seleniumworkspace\\TestNG_1\\TestData.xlsx");
		int rows = config.getRowCount(0);
		Object[][] credentials = new Object[rows][2];
		for (int i = 0;  i < rows ;i++){
			credentials[i][0]=config.getData(0, i, 0);
			credentials[i][1]=config.getData(0, i, 1);
		}
		return credentials;

	}

}
