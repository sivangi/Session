package reports;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("Test");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver=new FirefoxDriver();
		logger.info("Firefox opened");
		
		driver.get("http://www.whiteboxqa.com/");
		logger.info("Browser launched");
	}

}
