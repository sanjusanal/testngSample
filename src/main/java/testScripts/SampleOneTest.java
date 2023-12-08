package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void javaseachTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Cucumber Tutorial");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
		driver.close();
		
	}
}
