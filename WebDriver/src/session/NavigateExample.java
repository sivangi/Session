package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {

	public static void main(String[] args) {
		// Creating WebDriver Object
		System.out.println("Launch Home page using Get Method");
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Opens the given URL using Get Method
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on Contact Us Link
		System.out.println("Open Help page");
		driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[5]")).click();
		// Using Back Command, go back to "Home" page
		System.out.println("Navigate Back to Home Page");
		driver.navigate().back();
		// Using Forward Command, go to help link
		System.out.println("Navigate Forward to Help Page ");
		driver.navigate().forward();
		// Refresh the page
		System.out.println("Refresh the Help Page ");
		driver.navigate().refresh();
		// Using To command, open the today's deal Page
		System.out.println("Navigate To Today's Deal Page");
		driver.navigate().to("https://www.amazon.com/gp/goldbox/ref=nav_cs_gb");

		System.out.println("Close the Browser");
		// Closing the Browser
		driver.close();

	}

}