package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    LoginPage login=new LoginPage(driver);
	    login.setUserName("abc");
	    login.setPassword("xyz");
	    login.clickLogin();
	    login.setUserName("admin");
	    login.setPassword("manager");
	    login.clickLogin();
	
	}
}
