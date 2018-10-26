package package1;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.out.println(driver);
	driver.get("file:///C:/Users/anjali/Desktop/demo.html"); //copy html file's link in browser 
	
	//driver.findElement(By.xpath("./html/body/a")).click();
	driver.findElement(By.xpath("./html/bo//a")).click();
	

}
}


