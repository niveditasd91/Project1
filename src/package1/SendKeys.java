package package1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void myTest(WebDriver driver)
	{
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\demo.actitime.com");
		WebElement e=driver.switchTo().activeElement();
		e.sendKeys("anjali");
		
		
}
}


