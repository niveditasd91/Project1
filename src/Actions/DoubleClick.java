package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://drive.google.com/drive/my-drive");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("niveditasd91@gmail.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("password")).sendKeys("Megha@91");
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement click = driver.findElement(By.className("l-u-Ab-zb-Pn-ve"));
		org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
		action.doubleClick(click).perform();
	}

}
