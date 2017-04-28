package reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngReports {

	@Test(priority = 1)
	public void VerfyingTestCaseID_001() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 2)
	public void VerfyingTestCaseID_002() {
		System.out.println("Test");
		System.out.println("this");
	}

	@Test(priority = 3)
	public void VerfyingTestCaseID_003() {
		System.out.println("Test");
		System.out.println("this");
	}

	@Test(priority = 4)
	public void VerfyingTestCaseID_004() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 5)
	public void VerfyingTestCaseID_005() {
		System.out.println("Test");
		System.out.println("This");
		Assert.assertEquals("ValidText", "InvalidText");
	}

	@Test(priority = 6)
	public void VerfyingTestCaseID_006() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 7)
	public void VerfyingTestCaseID_007() {
		System.out.println("Test");
		System.out.println("This");
		Assert.assertEquals("ValidText", "InvalidText");

	}

	@Test(priority = 8)
	public void VerfyingTestCaseID_008() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 9)
	public void VerfyingTestCaseID_009() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 10)
	public void VerfyingTestCaseID_010() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 11)
	public void VerfyingTestCaseID_011() {
		System.out.println("Test");
		System.out.println("This");
		Assert.assertTrue(false);
	}

	@Test(priority = 12)
	public void VerfyingTestCaseID_012() {
		System.out.println("Test");
		System.out.println("This");
		Assert.assertTrue(false);

	}

	@Test(priority = 13)
	public void VerfyingTestCaseID_013() {
		System.out.println("Test");
		System.out.println("This");
	}

	@Test(priority = 14)
	public void VerfyingTestCaseID_014() {
		System.out.println("Test");
		System.out.println("This");
	}
}
