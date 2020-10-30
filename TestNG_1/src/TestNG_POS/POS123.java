
package TestNG_POS;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class POS123 {
	public String baseUrl = "http://localhost/POS/public/login";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
	@Test(priority=1)
	public void A_Login() throws InterruptedException{


		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//input[@name='loginButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
	}
	@Test(priority=2)
	public void B_sales() throws InterruptedException{
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[2]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		//		WebElement phone =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[2]/input[1]"));
		//		Actions action = new Actions(driver);
		//		action.moveToElement(phone).click().perform();

	}
	@Test(priority=3)
	public void C_newItem() throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("Laptopbattery");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("laptops");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/input[1]")).sendKeys("2000");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/input[1]")).sendKeys("4000");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[11]/div[1]/input[1]")).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[12]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[12]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[13]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[13]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();


	}

	@Test(priority=4)
	public void D_NewCustomer() throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("Rishabh");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/input[1]")).sendKeys("Mangudkar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[5]/div[1]/div[1]/input[1]")).sendKeys("rishabh2365@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[7]/div[1]/input[1]")).sendKeys("Nasik");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[14]/div[1]/div[1]/input[1]")).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
	}

	@Test(priority=5)
	public void E_Invoice() throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(4000);
	}

	@Test(priority=6)
	public void F_getscreenshot() throws Exception{
		Thread.sleep(4000);
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\ScreenShot_POS1.jpg"));

	}
	@Test(priority=7)
	public void G_Report(){
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/form[1]/button[1]")).click();

	}
	@Test(priority=8)
	public void H_getscreenshot() throws Exception{
		Thread.sleep(4000);
		File scrfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile1, new File("E:\\ScreenShot_POSTask2.jpg"));

	}


	@BeforeTest

	public void Launchbrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}


	@AfterTest
	public void afterTest() {
		//	driver.close();

	}

}
