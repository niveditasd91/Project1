package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		// I.open the browser
		WebDriver driver = new ChromeDriver();

		// II.enter the url
		driver.get("https://demo.actitime.com/login.do");
		// enter the username and enter the pw n click on login button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());
		driver.close();

	}
}