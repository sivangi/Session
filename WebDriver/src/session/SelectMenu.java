package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.whiteboxqa.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement melement = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/a"));
		WebElement subelement = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/ul/li[1]/a"));

		Actions action = new Actions(driver);
		action.moveToElement((WebElement) By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/a"));
		action.moveToElement(melement)
				.moveToElement(subelement.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/ul/li[1]/a")))
				.click().build().perform();

	}

}
