package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.xml.utils.ThreadControllerWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownlad {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		//Using Chrome browser
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();

//--------------------------------------------------------------------------------------------		
		//Using firefox browser
	
//		WebDriver  driver=new FirefoxDriver();
//		driver.get("http://www.seleniumhq.org/download");
//		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);

	
		
}
}