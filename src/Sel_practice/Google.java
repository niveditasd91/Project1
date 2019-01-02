package Sel_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("niveditasd91");
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("password")).sendKeys("Megha@91");
		r.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println(driver.getTitle());
		
		 WebElement prim = driver.findElement(By.id(":2y")); 
		System.out.println(prim.getText());
		
		List<WebElement> priMail = driver.findElements(By.xpath("//table[@id=':35']/tbody/tr"));
		System.out.println(priMail.size());
		
		/*if(prim.isEnabled()) {
			System.out.println(prim.getText());
		}*/
		
		Runtime rt=Runtime.getRuntime();
		rt.exec("taskkill -f -im chromedriver.exe");
		
	}
}
