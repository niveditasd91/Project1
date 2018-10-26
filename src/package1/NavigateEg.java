package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateEg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http:\\www.gmail.com");
		driver.navigate().to("http:\\www.gmail.com");
		driver.navigate().back();//goes to previous tab
		driver.navigate().forward();//goes to farward tab
		driver.navigate().refresh();//refresh page
}
}