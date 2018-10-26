package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatePage_Locators {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/mege/Desktop/demo.html");
		//	WebElement e = driver.findElement(By.tagName("a"));
			driver.findElement(By.tagName("a")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			//In the browser find the element by using tag name 'a' and click it.
			driver.findElement(By.id("al")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			

			driver.findElement(By.name("nl")).click();
			Thread.sleep(1000);
			driver.navigate().back();

			driver.findElement(By.className("cl")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			driver.findElement(By.linkText("Google")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			driver.findElement(By.partialLinkText("Goo")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("a[id='al']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}