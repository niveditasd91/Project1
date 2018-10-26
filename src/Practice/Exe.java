package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//Scrolling to particular element		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		String xp = "//h2[text()='15. Miscellaneous']";
		WebElement e = driver.findElement(By.xpath(xp));
		int x = e.getLocation().getX();
		System.out.println(x);

		int y = e.getLocation().getY();
		System.out.println(y);

		WebElement h = driver.findElement(By.cssSelector("header.header"));
		int height = h.getSize().height;


		y=y-height;
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo("+x+","+y+")");
		 */

		//Print the msg on login page		
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("alert('hi')");
		 */
		
//Handling disabled element
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/disabled.html");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('t1').value='qsp'");
		//document.getElementById('t1').value='Megha'

	}
}