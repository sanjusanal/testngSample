package testScripts;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.network.model.RequestWillBeSent;
import org.testng.annotations.BeforeMethod;

public class CDPTest {
	ChromiumDriver driver;
	DevTools devTools;
 
  @BeforeMethod
  public void setup() {
	  driver = new ChromeDriver();
	  devTools = driver.getDevTools();
	  devTools.createSession();
	  }
//@Test
public void deviceModeTest() {
	Map deviceMetrics = new HashMap() {{
		put("width", 800);
		put("height", 1000);
;
		put("deviceScaleFactor", 50);
		put("mobile", true);
	}};
	driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	driver.get("https://www.selenium.dev/");
		
	}
//@Test
public void geoLocationTest() {
	Map deviceMetrics = new HashMap() {{
		put("latitude", 40.712776);
		put("longitude", -74.005974);
		put("accuracy", 100);
	}};
	driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
	driver.get("https://oldnavy.gap.com/stores");
	}
@Test
public void captureNetworkTrafficTest() {
	Map deviceMetrics = new HashMap() {{
		put("maxTotalBufferSize", 1000);
		put("maxResourceBufferSize", 1000);
		put("maxPostDataSize", 1000);
	}};
	devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
	devTools.addListener(Network.requestWillBeSent(), new Consumer<RequestWillBeSent>() {
		@SuppressWarnings("unused")
		public void accpet(RequestWillBeSent entry) {
			System.out.println("Rrquest URI :" + entry.getRequest().getUrl() + "\n" +
		             "With Method :" + entry.getRequest().getMethod()+ "\n");
			entry.getRequest().getMethod();
		}

		@Override
		public void accept(RequestWillBeSent t) {
			// TODO Auto-generated method stub
			
		}
  });
	driver.get("https://www.selenium.dev/");
	devTools.send(Network.disable());
}

}



