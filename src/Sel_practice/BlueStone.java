package Sel_practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	driver.switchTo().frame("livechat-compact-view");
		driver.findElement(By.xpath("//div[@id='content']/a/span[@id='open-label']")).click();
		//Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("Nivedita");
		driver.findElement(By.id("email")).sendKeys("niveditasd91@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'container')]")).sendKeys("9964809089");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		WebElement msg = driver.findElement(By.name("files"));
		msg.click();
		msg.sendKeys("hi");
		String text = driver.findElement(By.xpath("//div[@id='view-queued-form']/div/form/div/p[contains(.,'One of')]")).getText();
		System.out.println(text);
		
		
		Runtime rt=Runtime.getRuntime();
	rt.exec("taskkill -f -im chromedriver.exe");
	}
}
