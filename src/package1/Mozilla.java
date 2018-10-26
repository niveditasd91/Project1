package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {
	static
	{
		String key="webdriver.gecko.driver";
	    String value="./driver/geckodriver.exe";
		
	
	
		System.setProperty(key,value);
	}
	
public static void main(String[] args) {
	//System.out.println("Driver: " + System.getProperty("webdriver.gecko.driver"));
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:\\Users\\mege\\Desktop\\Selenium\\Project1\\test.html");
	String title = driver.getTitle();
	System.out.println("Title is " + title);
	String input_id = "mytext1";
	WebElement e = driver.findElementByName(input_id);
	e.sendKeys("INDIA");
	driver.findElementByName("sbmit").click();
	//e.submit();
	
	
}
}
