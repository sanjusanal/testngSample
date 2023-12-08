package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;
	//@BeforeMethod
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void seleniumseachTest()
	{
		driver.get("https://www.google.com/");
		//Assert.assertEquals(driver.getTitle(), "Google");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("selenium tutorial");
		srcBox.submit();
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "selenium tutorial - Google Search");
		
		
	}
	@Test(priority=-2)
	public void testngseachTest()
	{
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("TestNG tutorial");
		srcBox.submit();
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "TestNG tutorial - Google Search");
		
		
	}
	@Test(enabled=false)
	public void apiumseachTest()
	{
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Apium tutorial");
		srcBox.submit();
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Apium tutorial - Google Search ");
		
		
	}
	@Test(enabled=false)
	public void eclipseseachTest()
	{
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Eclipse tutorial");
		srcBox.submit();
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Eclipse tutorial - Google Search ");
		
		
	}
//	@Test
//	public void seleniumseachTest()
//	{
//		driver.get("https://www.google.com/");
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(driver.getTitle(), "Google1");
//		WebElement srcBox = driver.findElement(By.id("APjFqb"));
//		srcBox.sendKeys("selenium tutorial");
//		srcBox.submit();
//		driver.getTitle();
//		softAssert.assertEquals(driver.getTitle(), "selenium tutorial - Google Search");
//		softAssert.assertAll();
//		
//	}
	@Test(dependsOnMethods = "seleniumseachTest")
	public void javaseachTest()
	{
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java tutorial");
		srcBox.submit();
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Java tutorial - Google Search");
		
		
	}
	//@AfterMethod
	@AfterTest
	public void end() {
		driver.close();
	}

}
