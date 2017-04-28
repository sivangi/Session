package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.out.println("Launching Browser");
		// Opening the URL
		driver.get("http://www.Google.com");
		// Implicit wait for the browser to launch
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Google Search Text-box
		WebElement element = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		// Creating action class object
		Actions Act = new Actions(driver);
		// Creating action collection to perform numerous methods on element
		Actions moreActions = Act.moveToElement(element).click().keyDown(element, Keys.SHIFT) // for
																								// caps
				.sendKeys(element, "selenium");

		Action enterInCaps = moreActions.build();
		enterInCaps.perform();
		System.out.println("Text is entered in Captial letters");
				// Closing the browser
		driver.quit();
	}

}
