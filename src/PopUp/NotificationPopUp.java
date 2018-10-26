package PopUp;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
	
		//for chrome driver

	//ChromeOptions options=new ChromeOptions();
//	options.addArguments("--disable-notifications");
	WebDriver  driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("http://www.yatra.com");
	
//---------------------------------------------------------------		
		//for firefox driver

		/*FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		WebDriver  driver=new FirefoxDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("http://www.yatra.com");
		*/
}
}


