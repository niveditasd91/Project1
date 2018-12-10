package Practice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/att.html");
		String value=driver.findElement(By.xpath("//input[@type='button']")).getAttribute("value");
		Robot r=new Robot();
		System.out.println(value);
	}
}
