package projects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotKayak {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'http://www.Kayak.com/'");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		System.out.println("Open home page");

		driver.findElement(By.partialLinkText("Flights")).click();

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// Click on Selenium Webdriver level button
		// js.executeScript("arguments[0].click();",
		// driver.findElement(By.partialLinkText("Flights")).click();

		System.out.println("Navigate to flight page");

		@SuppressWarnings("unused")
		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.partialLinkText("Flight"));

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		WebElement origin = driver.findElement(By.name("origin"));
		WebElement destination = driver.findElement(By.name("destination"));
		WebElement depart = driver.findElement(By.className("r9-datepicker-display"));
		WebElement back = driver.findElement(By.className("r9-datepicker-display"));
		WebElement select = driver.findElement(By.className("label"));
		// WebElement button = driver.findElement(By.id("c2tsy"));
		WebElement search = driver.findElement(By.className("Common-Widgets-Button searchButton"));

		Actions Act = new Actions(driver);

		@SuppressWarnings("unused")
		Actions moreActions = Act.moveToElement(origin).sendKeys(origin, "Los Angeles (LAX)").moveToElement(destination)
				.sendKeys(destination, "India").moveToElement(depart).click().sendKeys(depart, "09/15/2016")
				.moveToElement(back).click().sendKeys(back, "10/15/2016").moveToElement(select).click()
				// .moveToElement(button).click()
				.moveToElement(search).click();

		try {

			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenshot, new File("C:\\Users\\Shivangi\\Desktop\\screenshot.jpeg"));

		} catch (Exception e) {

			System.out.println("Failure to take screenshot " + e);

		} finally {

			driver.quit();
		}
	}
}
