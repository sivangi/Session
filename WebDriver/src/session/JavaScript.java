package session;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JavaScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1024,768");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);

		driver.get("http://google.com/");

		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("alert('hello world');");
		}

	}
}
