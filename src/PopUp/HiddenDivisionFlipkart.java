package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://flipkart.com");
	driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("bhanu");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button)[2]")).click();
	
}
}
