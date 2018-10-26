package POMEG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import package1.LoginPage;

public class TestLoginFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FBLogin login = new FBLogin(driver);

		login.setUserName("desai.nivedita90@gmail.com");
		login.setPassword("Angel20");
		login.clickLogin();
		Thread.sleep(3000);
		FBDropDown drop = new FBDropDown(driver);
		drop.dropClick();

		FBHomePage logout = new FBHomePage(driver);
		logout.CliclLogout();

	}
}