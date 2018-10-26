package Muharram;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeClass
	public void m1() {
		Reporter.log("Before class", true);
	}

	@AfterClass
	public void m2() {
		Reporter.log("After class", true);
	}

	@BeforeMethod
	public void m3() {
		Reporter.log("Before Method", true);
	}

	@AfterMethod
	public void m4() {
		Reporter.log("After Method", true);
	}

	@BeforeTest
	public void m5() {
		Reporter.log("Before Test", true);

	}

	@AfterTest
	public void m6() {
		Reporter.log("After test", true);
	}

	@BeforeSuite
	public void m7() {
		Reporter.log("Before suite", true);

	}

	@AfterSuite
	public void m8() {
		Reporter.log("After Suite", true);

	}
}