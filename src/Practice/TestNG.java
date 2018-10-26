package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG {
//Annotaion	
/*
	  @BeforeSuite
	  public void test2() {
		Reporter.log("test2");
	  }
	  
	  @AfterSuite
	  public void test3() {
		  Reporter.log("test3");
	  }
	  
	  @BeforeClass
	  public void test4() {
		  Reporter.log("test4");
	  }
	  
	  @AfterClass
	  public void test5() {
		  Reporter.log("test5");
	  }
	  
	  @BeforeTest
	  public void test6() {
		  Reporter.log("test6");
	  }
	  
	  @AfterMethod
	  public void test7() {
		  Reporter.log("test7");
	  }
	  
	  @AfterTest
	  public void test8() {
		  Reporter.log("test8");
	  } 
		 
		  @BeforeMethod
		  public void test9() {
			  Reporter.log("test9");
	  }
	@Test
	  public void test10() {
		Reporter.log("AllTest",true);
 }
	*/
	
//Data Provider	
	/*@DataProvider
	public Object[][] test() {
		Object[][] data=new Object[2][2];
		data[0][0]="UserA";
		data[0][1]= 123;
		
		data[1][0]="UserB";
		data[1][1]= 456;
		return data;
		
	}
	@Test(dataProvider="test")
	public void test1(String un,int pw){
		Reporter.log("create user:"+un+"pw:"+pw,true);
	}
	*/
		  
//Groups
/*@BeforeMethod(alwaysRun=true)
	  public void test2() {
		Reporter.log("test2",true);
	  }
	  
@Test(groups= {"a"})
	  public void test3() {
		  Reporter.log("test3",true);
	  }
	  
@Test(groups= {"b","c"})
	  public void test4() {
		  Reporter.log("test4",true);
	  }
	  
@Test(groups= {"b","a"})
	  public void test5() {
		  Reporter.log("test5",true);
	  }
 
@Test()
	  public void test6() {
		  Reporter.log("test6");
	  }*/
//-----------------------------------------------------------------------------------	
//SOftAssert and assert	
/*	
@Test
	public void testLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String actTitle = driver.getTitle();
		// Reporter.log(actTitle, true);
		String expTitle = "actiTIME - login";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actTitle, expTitle);
		driver.close();
		s.assertAll();// dont write any statements after this

	}

	@Test
	public void testLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Login";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
		}
*/
//----------------------------------------------------------------------------------
	/*@Parameters({"city","pincode"})
	
	@Test
	public void testA(@Optional("Delhi")String c,@Optional("market")String a) {
		Reporter.log(c + a, true);
	}
	*/

	
	/*@Parameters({"city","pincode"})
	@Test
	public void testA(String c,String a) {
		Reporter.log(c+a, true);
	}*/
	
	
//-------------------------------------------------------------------------	
	 
	@Test()
		  public void testA() {
			  Reporter.log("create user",true);
			 
}
	
	@Test(dependsOnMethods= {"testA","testC"})
	  public void testB() {
		  Reporter.log("delete user",true);
	}
			@Test()
			  public void testC() {
				  Reporter.log("edit user",true);
				  
}
			}