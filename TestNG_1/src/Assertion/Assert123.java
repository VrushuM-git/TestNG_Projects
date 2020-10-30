package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class Assert123 extends BaseClass{
	@Test(priority=1)
	public void Verification_Mtd(){
		String title = driver.getTitle();
		if (title=="Administration Login")
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("not match");
		}
	}
	@Test(priority=2)
	public void assertionmtd(){
		String expectedTitle = "Administration Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("pass");

	}
	@Test(priority=3)
	public void assertionmtd1(){
		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		Assert.assertNotEquals(expectedTitle, actualTitle);
		System.out.println("fail");

	}
	@Test(priority=4)
	public void loginmtd() throws InterruptedException {


		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("vrushali");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().matches("Dashboard"),"Invalid credentials");
		System.out.println("login successful");



	}

}
