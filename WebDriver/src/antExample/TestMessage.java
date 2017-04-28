package antExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessage {
	String message = "Manisha";
	Message messageUtil = new Message(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Shivangi";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}