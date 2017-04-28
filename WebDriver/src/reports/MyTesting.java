package reports;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTesting {
	WebDriver driver = new FirefoxDriver();


	@Before
	public void beforetest() {
		driver.manage().window().maximize();
		driver.get("http://www.only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	@After
	public void aftertest() {
		driver.quit();

	}

	@Test
	public void test() throws InterruptedException {

		Logger log=Logger.getLogger("MyTesting");
		PropertyConfigurator.configure("Log4j.properties");
		//Logger log;
		driver.findElement(By.id("text1")).sendKeys("My First Name");
		log = Logger.getLogger(MyTesting.class);
		log.info("Type In Text field.");
		Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
		mydrpdwn.selectByVisibleText("Audi");
		log = Logger.getLogger(MyTesting.class);
		log.info("Select value from drop down.");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
	}

}