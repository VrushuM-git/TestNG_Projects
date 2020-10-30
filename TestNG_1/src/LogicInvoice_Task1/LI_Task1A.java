package LogicInvoice_Task1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

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

public class LI_Task1A {
	public String baseUrl = "http://localhost/Logic_Invoice/upload/admin/";
	String driverPath = "c:\\chromedriver.exe";
	public WebDriver driver;
	public static Select dropdown;
	@Test
	public void  A_LogicInvoive(){
		// driver.get("http://localhost/Logic_Invoice/upload/admin/");
		driver.findElement(By.id("input-username")).sendKeys("vrushali");
		driver.findElement(By.id("input-password")).sendKeys("vrushali123");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//img[@id='button-menu']")).click();

	}
	@Test
	public void B_Accounting(){

		WebElement Accounting = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[2]/a[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Accounting).click().perform();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		WebElement Account = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Account).click().perform();
	}
	@Test
	public void C_AccountAdd() throws InterruptedException{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("EM_1234");;
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Vrushali2 xyz");

		WebElement parent =driver.findElement(By.xpath("//select[@id='input-parent']"));
		Select dropdown1 = new Select(parent);
		dropdown1.selectByVisibleText("Accounts Receivable");
		Thread.sleep(3000);

		dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/select[1]")));
		dropdown.selectByVisibleText("Fixed Asset");
		Thread.sleep(4000);



		driver.navigate().back();
	}
	@Test
	public void getscreenshot()throws Exception{
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\ScreenShot_2.jpg"));
		//		{
		//			getscreenshot();
		//		}

	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@AfterTest
	public void afterTest() {
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		driver.close();
	}
}
