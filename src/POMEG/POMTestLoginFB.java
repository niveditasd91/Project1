package POMEG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class POMTestLoginFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		POMLoginFB login=new POMLoginFB(driver);
		login.setUserName("desai.nivedita90@gmail.com");
		login.setPassword("Angel20");
		login.clickLogin();
		POMLogoutFB logout=new POMLogoutFB(driver);
		logout.dropClick();
		logout.CliclLogout();

}
}