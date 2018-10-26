package PopUp;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//To close all the browsers
		
		WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
	
		 for(String wh: allWHS) {
			 driver.switchTo().window(wh);
			 System.out.println(driver.getTitle());
			// driver.close();
		 }
	
		
		
	//Closes all the child browsers except parent.
		
		/*WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.naukri.com");
		String parent=driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		 allWHS.remove(parent);
		 for(String wh: allWHS) {
			 driver.switchTo().window(wh).close();
		 }
		 */
		 
		 
		 
		//Closes the specified child browser.
			
			/*WebDriver driver =new ChromeDriver();
			driver.get("http:\\www.naukri.com");
			Set<String> allWHS = driver.getWindowHandles();
			 for(String wh: allWHS) {
				 driver.switchTo().window(wh);
				 String title=driver.getTitle();
				 if(title.equals("Amazon")) {
					 driver.close();
				 }
			 }*/
	}
}
			 	 
		
