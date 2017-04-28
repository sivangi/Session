package session;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String handle = driver.getWindowHandle();

		System.out.println(handle);

		WebElement element = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		element.sendKeys("Selenium");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);

		for (String handle1 : driver.getWindowHandles()) {

			System.out.println(handle1);

			driver.switchTo().window(handle1);

			try {
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/div/div[2]/a")));
				driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/div/div[2]/a")).click();
			} catch (TimeoutException e) {

				System.out.println(e);

			}
			driver.close();
			driver.switchTo().window(handle);
			driver.close();
		}

	}

}
