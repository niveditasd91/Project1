package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		// I.open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// II.enter the url
		driver.get("https://demo.actitime.com/login.do");
		// enter the username and enter the pw n click on login button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		// logout
		Thread.sleep(10000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

}
