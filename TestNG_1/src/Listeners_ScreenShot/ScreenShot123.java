package Listeners_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot123 {



	public static WebDriver driver;
	@BeforeTest
	public static void Launch() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/POS/public/login");
		Thread.sleep(2000);
	}

	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//input[@name='loginButton']")).click();
		

	}

	@AfterMethod
	public void takeScreenOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE)
		{
			System.out.println(testResult.getStatus());
			File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("E:\\"+testResult.getName()+".jpg"));

		}
	}
}






