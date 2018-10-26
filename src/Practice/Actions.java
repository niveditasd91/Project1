package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Mouse Hover
		/*
		  WebDriver driver=new ChromeDriver(); driver.get("http://www.actitime.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		  menu = driver.findElement(By.xpath("//a[.='Features']"));
		  org.openqa.selenium.interactions.Actions action=new
		  org.openqa.selenium.interactions.Actions(driver);
		  action.moveToElement(menu).perform();
		  driver.findElement(By.xpath("(//li/a[.='Simple Time Tracking'])[1]")).click() ;
		 */
		// ISTQB Mouse Hover
		/*
		  WebDriver driver=new ChromeDriver(); driver.get("https://www.istqb.org/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		  menu=driver.findElement(By.xpath("(//a)[@class=' dropdown-toggle'][4]"));
		  org.openqa.selenium.interactions.Actions action=new
		  org.openqa.selenium.interactions.Actions(driver);
		  action.moveToElement(menu).perform();
		  driver.findElement(By.linkText("Why ISTQB® Certification?")).click();
		  driver.close();
		 */

		// Composite Action
		/*
		  WebDriver driver=new ChromeDriver(); driver.get("http://demo.actitime.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize(); WebElement menu=
		  driver.findElement(By.linkText("actiTIME Inc."));
		  org.openqa.selenium.interactions.Actions action=new
		  org.openqa.selenium.interactions.Actions(driver);
		  action.sendKeys(Keys.CONTROL).click(menu).perform(); Thread.sleep(1000);
		 */

// Context click
		/*WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
		action.contextClick(link).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		 */


		//		Drag and Drop

		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src=	driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement dest=	driver.findElement(By.xpath("//h1[.='Block 1']"));
		org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
		action.dragAndDrop(src, dest).perform();
*/	
//Handling Frames
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); 
		WebElement src=	driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
		action.dragAndDrop(src, dest).perform();*/
		
//Handling frames	
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/mege/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("abc");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("xyz");
*/

//DoubleClick		
	WebDriver driver=new ChromeDriver();
	driver.get("https://drive.google.com/drive/my-drive");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("identifierId")).sendKeys("niveditasd91@gmail.com");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	driver.findElement(By.name("password")).sendKeys("Megha@91");
	r.keyPress(KeyEvent.VK_ENTER);
	WebElement click = driver.findElement(By.className("l-u-Ab-zb-Pn-ve"));
	org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
	action.doubleClick(click).perform();
	}
}
