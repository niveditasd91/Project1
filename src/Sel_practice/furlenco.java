package Sel_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class furlenco {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.furlenco.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		 driver.findElement(By.xpath("(//div[text()='Living Room'])[2]")).click();
		 driver.findElement(By.xpath("//h1[contains(text(),'Pico Three')]")).click();
		  }
		 

	}
