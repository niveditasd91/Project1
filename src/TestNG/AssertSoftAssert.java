package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoftAssert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

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
//Assert
/*	@Test
	public void testLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Login";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
		}
*/
	

}
