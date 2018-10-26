package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitEg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("http:\\www.google.com");
		driver.get("http:\\www.naukri.com");
		//driver.quit();

		driver.close();

		
	}
		

}
