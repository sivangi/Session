package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	    WebDriver selenium = new ChromeDriver();
		System.out.println("Launching Browser");
		// Opening the URL
		selenium.get("http://jqueryui.com/resources/demos/droppable/default.html");
		// Implicit wait for the browser to launch
		selenium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Identifying the elements to perform action
		WebElement drag = selenium.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = selenium.findElement(By.xpath("//*[@id='droppable']"));
		//Actions Act = new Actions(selenium);
		// Performing Drag and Drop operation
		Actions builder = new Actions(selenium);
        Action dragAndDrop = builder.clickAndHold(drag)
            .moveToElement(drop)
            .release(drop)
            .build();
        dragAndDrop.perform();        
 
		System.out.print("Successfully completed the Drag-Drop operation");
	}

}
