package session;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	 
	    public static void main (String[]args){
	    {
	    	System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			     
	        Robot robot=null;        
	        driver.get("http://www.makemytrip.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath(".//*[@id='ssologinlink']")).click();
	        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("username@gmail.com");
	        driver.findElement(By.xpath(".//*[@id='password_text']")).sendKeys("password");        
	        try {
	            robot=new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	        //Keyboard Activity Using Robot Class
	        robot.keyPress(KeyEvent.VK_ENTER);
	    }
	}
}