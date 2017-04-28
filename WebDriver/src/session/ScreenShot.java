package session;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Facebook.com");

		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Name@gmail.com");

		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Password");

		driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();

		try {
			// take screenshot and save it in a file
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// copy the file to the required path
			FileUtils.copyFile(screenshot, new File("C:\\Users\\Shivangi\\Desktop\\screenshot.jpeg"));

		} catch (Exception e) {
			// if it fails to take screenshot then this block will execute
			System.out.println("Failure to take screenshot " + e);

		} finally {
			// Whatever happens with the screenshot, driver will quit.
			driver.quit();
		}
	}
}
