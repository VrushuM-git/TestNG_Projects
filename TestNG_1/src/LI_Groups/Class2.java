package LI_Groups;

import org.testng.annotations.Test;

//import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class2 extends Class1{
	@Test(groups={"sanityTest"})
	public void Login() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("input-username")).sendKeys("vrushali");
		Thread.sleep(4000);
		driver.findElement(By.id("input-password")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//img[@id='button-menu']")).click();
		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}


}