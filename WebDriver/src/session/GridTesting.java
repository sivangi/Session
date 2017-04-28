package session;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridTesting{
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.XP);
		
		
		driver = new RemoteWebDriver(new URL("http://192.168.216.1:1234/wd/hub"),cap);
		
	}
	@Test
	public void simpleTest(){
		driver.get("http://www.google.com");
		
		
	}
}