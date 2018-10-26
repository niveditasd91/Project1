package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverISTQB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.istqb.org/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.linkText("Certification"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Why ISTQB® Certification?")).click();
		
	}

}
