package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridActitime {
	@Parameters({"ip","browser"})
	@Test 
	public void testGrid(String ip,String browser) throws Exception {
		
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.get("http://demo.actitime.com");
		for(int j=1;j<=100;j++) {
			WebElement un=driver.findElement(By.id("username"));
			un.sendKeys("admin");
			un.clear();
		}
		

	}
}



	/*///@Parameters({"ip","browser"})
	@Test
	public void testGrid(String i,String b) throws Exception {


		//java.net.URL remoteAddress=new java.net.URL("http://localhost:4444/wd/hub");
		//java.net.URL remoteAddress=new java.net.URL("http://"+ip+":4444/wd/hub");
		java.net.URL remoteAddress=new java.net.URL("http://"+i+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setBrowserName(b);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);

		driver.get("http://demo.actitime.com");
		for(int j=1;j<=100;j++) {
			WebElement un=driver.findElement(By.id("username"));
			un.sendKeys("admin");
			un.clear();
		}
driver.close();

	 */

