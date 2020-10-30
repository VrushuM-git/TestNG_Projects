package Multiple_classes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassOne extends BaseClass{
	
  @Test(priority=1)
  public void Login() throws InterruptedException {
	  	Thread.sleep(5000);
	  	driver.findElement(By.id("input-username")).sendKeys("vrushali");
		driver.findElement(By.id("input-password")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//img[@id='button-menu']")).click();
		String expectedTitle = "Dashboard";
	  	String actualTitle = driver.getTitle();
	  	AssertJUnit.assertEquals(expectedTitle, actualTitle);
  }
}
