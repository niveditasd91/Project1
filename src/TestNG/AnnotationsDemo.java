package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeClass
	public void openApp() {
		Reporter.log("open APP", true);
	}

	@AfterClass
	public void closeApp() {
		Reporter.log("close APP", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
	}

	@Test(priority = -1)
	public void createUser() {
		Reporter.log("createuser", true);
	}

	@Test(invocationCount = 3)
	public void editUser() {
		Reporter.log("edituser", true);
	}

	@Test(priority = 1, invocationCount = 0)
	public void deleteUser() {
		Reporter.log("deleteuser", true);
	}

}
