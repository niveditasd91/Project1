package JavasciptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/disabled.html");
	//driver.findElement(By.id("t1")).sendKeys("abc");
	    //InvalidElementStateException
	String code="document.getElementById('t1').value='abc'";
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript(code);
	
	
	
}
}
