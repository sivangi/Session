package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");

		driver.manage().window().maximize();

		JavascriptExecutor jsx = (JavascriptExecutor) driver;

		jsx.executeScript("window.scrollBy(0,4500)", ""); // scroll down

		Thread.sleep(3000);

		jsx.executeScript("window.scrollBy(450,0)", ""); // scroll up

	}

}
