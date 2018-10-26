package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement_Eg {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.get("http:\\demo.actitime.com");
			WebElement e = driver.switchTo().activeElement();
			e.sendKeys("Nivedita");
}
}