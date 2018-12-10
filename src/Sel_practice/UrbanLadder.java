package Sel_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder {
	static
	{
		System.setProperty("webdriver/chrome.driver", "./driver.chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.urbanladder.com");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		System.out.println("SALE");
		WebElement Living = driver.findElement(By.xpath("(//span[contains(text(),'Sale')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(Living).perform();
		Thread.sleep(1000);
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']"));
		for (WebElement ele : allEle) {
			System.out.println(ele.getText());
		}
		System.out.println("<----------Living------->");
		WebElement living = driver.findElement(By.xpath("(//span[contains(text(),'Living')])[1]"));
		action.moveToElement(living).perform();
		Thread.sleep(2000);
		List<WebElement> sofa = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[1]"));
		System.out.println("--------SOFA----------");
		for (WebElement ele : sofa) {
			System.out.println(ele.getText());

		}
		System.out.println("--------CHAIRS----------");
		List<WebElement> chairs = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[2]"));
		for (WebElement ele : chairs) {
			System.out.println(ele.getText());
		}
		System.out.println("---------Tables----------");
		List<WebElement> tables = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[3]"));
		for (WebElement ele : tables) {
			System.out.println(ele.getText());
		}
		System.out.println("--------Bedroom------------");
		WebElement bed = driver.findElement(By.xpath("(//span[contains(text(),'Bedroom')])[1]"));
		action.moveToElement(bed).perform();
		List<WebElement> broom = driver.findElements(By.xpath("(//li[@class=\"topnav_item bedroomunit\"])/div/div/ul/li"));
		for (WebElement bedroom : broom) {
		System.out.println(bedroom.getText());
		
	}
		System.out.println("-------MATTRESS------------");
		List<WebElement> matress = driver.findElements(By.xpath("(//li[@class=\"topnav_item bedroomunit\"])/div/div/ul/li[2]"));
		for (WebElement bedroom : matress) {
		System.out.println(bedroom.getText());
		}
	}
}



/*
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.urbanladder.com");
	WebElement close = driver.findElement(By.xpath("//a[contains(text(),'Close')]"));
	if(close.isDisplayed()) {
		close.click();
	}
	Thread.sleep(2000);
	WebElement sale = driver.findElement(By.xpath("(//span[contains(text(),'Living')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(sale).perform();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='Fabric Sofa Sets']/..")).click();
}}*/