package Sel_practice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li"));
		Actions action = new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		

		for (int i = 0; i < mainMenu.size(); i++) {
			WebElement ele = mainMenu.get(i);
			action.moveToElement(ele);
			System.out.println(ele.getText());
			

			String xp = "//div[@id='block_top_menu']/ul/li/a/../ul/li/a/../ul/li";
			List<WebElement> subMenu = driver.findElements(By.xpath(xp));
			System.out.println(subMenu.size());
			for (int j = 0; j < subMenu.size(); j++) {
				WebElement text = subMenu.get(j);
				System.out.println(text.getText());
			}

		}
		driver.close();
		Runtime rt=Runtime.getRuntime();
		rt.exec("taskkill -f -im chromedriver");
	}

}
