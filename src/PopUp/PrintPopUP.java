package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	//Using firefox browser
//	WebDriver  driver=new FirefoxDriver();
//	driver.get("http://www.google.com");
//	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_P);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	Thread.sleep(1000);
//	
//	//press escape to cancel the popup
//	r.keyPress(KeyEvent.VK_ESCAPE);
//	
	//----------------------------------------------------------------------------------------

	//Using chrome  browser
	
	WebDriver  driver=new ChromeDriver();
	driver.get("http://www.google.com");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	
	//press escape to cancel the popup
	r.keyPress(KeyEvent.VK_ESCAPE);
	
	
}
}