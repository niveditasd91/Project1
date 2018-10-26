package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActitime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.actitime.com/");
		WebElement menu = driver.findElement(By.linkText("Features"));
		//Mouse hover on the menu
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Simple Time Tracking")).click();
		
	}

}
