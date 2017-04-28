package session;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToFaceBook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://whiteboxqa.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String handle = driver.getWindowHandle();

		System.out.println(handle);

		driver.findElement(By.xpath(".//*[@id='headerfblogin']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);

		for (String handle1 : driver.getWindowHandles()) {

			System.out.println(handle1);

			driver.switchTo().window(handle1);

		}

		driver.findElement(By.id("email")).sendKeys("Name@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("*******");
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		driver.switchTo().window(handle);
		driver.close();
	}
}
