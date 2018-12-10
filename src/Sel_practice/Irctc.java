package Sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("Gulbarga");
		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).click();
		driver.findElement(By.xpath("(//td[@class='ng-tns-c14-6 ng-star-inserted'])[8]")).click();
		//driver.close();
	}

}
