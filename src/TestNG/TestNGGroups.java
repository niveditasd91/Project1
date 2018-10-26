package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGGroups {
	@BeforeClass(alwaysRun=true)
	public void login(){
		Reporter.log("login", true);
	}
	
	@Test(priority=1,groups={"user","smoke"})
	public void createuser(){
		Reporter.log("create User", true);
	}
	
	
	@Test(priority=2,groups={"user"},enabled=false)
	public void editUser(){
		Reporter.log("Edit User", true);
	}
	
	
	@Test(priority=3,groups={"user"})
	public void deleteUser(){
		Reporter.log("delete User", true);
	}
	
	@Test(priority=4,groups={"product","smoke"})
	public void createProduct(){
		Reporter.log("create Product", true);
	}
	
	@Test(priority=5,groups={"product"})
	public void deleteProduct(){
		Reporter.log("delete product", true);
	}
	
	
	
}
