package remoteScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteDriverSample {
  @Test
  public void sampleTest() {
	  ChromeOptions options = new ChromeOptions();
	  String strHub = "";
	  RemoteWebDriver driver = new RemoteWebDriver (new URL(strHub), options));
	  
	  driver.get("https://www.google.com/");
	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.submit();
	  System.out.println("The Title is" + driver.getTitle() );
  }
}
