package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public  class Firefox {
	static
	{
	//String key="webdriver.gecko.driver";
	//String value="./driver/geckodriver.exe";
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.close();
		
	
		
		
	}
      
}
