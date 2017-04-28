package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.get("http://www.amazon.com");

		driver.manage().window().maximize();

		WebElement Am = driver.findElement(By.partialLinkText("Today's Deal"));

		Actions builder = new Actions(driver);

		builder.moveToElement(Am);
		builder.contextClick(Am).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	}
}