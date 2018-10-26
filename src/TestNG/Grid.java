package TestNG;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class Grid {

	@Parameters({ "ip", "browser" })
	@Test
	public void testGrid(String ip, String browser) throws Exception {
		java.net.URL remoteAddress = new java.net.URL("http://" + ip + ":4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		driver.get("http://www.google.com");

	}

}