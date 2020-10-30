package Multiple_classes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassTwo extends BaseClass {
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

	@Test(priority=2)
	public void account() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Accounting = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[2]/a[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Accounting).click().perform();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		WebElement Account = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Account).click().perform();

	}
}
