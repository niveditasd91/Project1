package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/findEle.html");
		// Get all the links from the page
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		/*
		 * for (int i = 0; i <count; i++) { WebElement link = allLinks.get(i); String
		 * text = link.getText(); String url = link.getAttribute("href");
		 * System.out.println(text+"--->"+url);
		 */

		for (WebElement link : allLinks) {
			String text = link.getText();
			String url = link.getAttribute("href");
			System.out.println(text + "--->" + url);
		}
	}

}