package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptDemo  {
static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	
	
	public static void main(String[] args) {
		//1.open the browser
		WebDriver driver=new ChromeDriver();
	
		//2.enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		//3.enter UN
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//4.enter pw
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//5.click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
		
		
	}
}




