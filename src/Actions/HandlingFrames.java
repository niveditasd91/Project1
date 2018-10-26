package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
  //Perform drag and drop using actions class
	/*WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	WebElement s = driver.findElement(By.id("draggable"));
	WebElement t = driver.findElement(By.id("droppable"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(s, t).perform();*/
	

 // Using Index
	/*WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/page1.html");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("A");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("A");*/
	
	
  //Using Id	
	/*WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/page1.html");
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("B");
	*/
	
 //Using Address
	/*WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/page1.html");
	WebElement e = driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(e);
	driver.findElement(By.id("t2")).sendKeys("c");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("c");
	*/
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement s = driver.findElement(By.id("draggable"));
	WebElement t = driver.findElement(By.id("droppable"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(s, t).perform();
	
}
}
