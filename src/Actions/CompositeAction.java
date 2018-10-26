package Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(1000);
		//ctrl+click (its a example for composite action->Multiple actions at a time)
		/*Set<String> allWHS=driver.getWindowHandles();
		System.out.println(allWHS.size());
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		driver.close();//close only current TAB
		driver.quit();//close all the TABs
			*/
		}
		

}

