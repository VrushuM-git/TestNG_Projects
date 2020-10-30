package Multiple_classes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForthClass extends BaseClass{
	//public Select dropdown;
	@Test(priority=1)
	public void Login() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("input-username")).sendKeys("vrushali");
		driver.findElement(By.id("input-password")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//img[@id='button-menu']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/a[1]")).click();

		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}
	@Test(priority=2)
	public void account() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Invoice1= driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Invoice1).click().perform();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement Invoice= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Invoice).click().perform();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}	
	@Test(priority=3)
	public void add1() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Priya");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("abcd");
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/input[1]")).sendKeys("priyaabcd123@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[9]/div[1]/div[1]/span[1]/button[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[10]/button[1]/i[1]")).click();
		Thread.sleep(6000);
	}
	@Test(priority=4)
	public void Payment() throws InterruptedException {  
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Priya1");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("abcd1");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("windhigh");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[11]/button[1]/i[1]")).click();
	}
	@Test(priority=5)
	public void PayMethod() throws InterruptedException{
		Thread.sleep(6000);
		dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/select[1]")));
		dropdown.selectByVisibleText("Cheque");
		Thread.sleep(6000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("AbcdSbI");
		Thread.sleep(6000);

		dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[4]/div[1]/select[1]")));
		dropdown.selectByVisibleText("US Dollar");
		Thread.sleep(6000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[5]/div[1]/input[1]")).sendKeys("60.00");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[7]/button[1]/i[1]")).click();
	}

	@Test(priority=6)
	public void Item() throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/button[1]/i[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("laptopBags");
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/input[1]")).sendKeys("4000");
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/input[1]")).sendKeys("50");
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[3]/button[1]")).click();
	}
	@Test(priority=7)
	public void Review() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(6000);
}

}
