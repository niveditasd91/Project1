package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/findEle.html");
		//Get all the links from the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//count number of links opened
		int count=allLinks.size();
		System.out.println(count);
		//get 1st link
		//WebElement link = allLinks.get(0);
		//get 2nd link
		WebElement link = allLinks.get(1);
		link.click();
		//driver.close();
	}
	

}