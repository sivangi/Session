package session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\Shivangi\\Downloads\\IEDriverServer_x64_2.53.1");
	 
		  driver = new InternetExplorerDriver();
		  
	  }
	  else if (browser.equalsIgnoreCase("chrome")){
		  
		  System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			 driver = new ChromeDriver();
	 
	  } 
	 
	  // Doesn't the browser type, launch the Website
	 
	  driver.get("http://www.whiteboxqa.com"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
	 
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
	 
	    driver.findElement(By.id(".//*[@id='username']")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id(".//*[@id='password']")).sendKeys("Test@123");
	 
	    driver.findElement(By.id(".//*[@id='login']")).click();
	 
		}  
	 
	  @AfterClass public void afterTest() {
	 
			driver.quit();
	 
		}
	 
	}

