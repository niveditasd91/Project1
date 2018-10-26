package JavasciptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSCriptExecutor {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	 //j.executeScript("alert('HI')");//prints hi in the login page
	String msg="Happy Festival";
	j.executeScript("alert('" +msg+"')");
	
	
	
}
}
