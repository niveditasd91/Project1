package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(1000);
	//click loginbutton without un nd pwd and click ok
	Alert alert=driver.switchTo().alert();
	//switch to pop up ,get the msg and click ok
	System.out.println(alert.getText());
	
	alert.accept();
	//alert.dismiss();
}
}
