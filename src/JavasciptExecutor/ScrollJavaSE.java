package JavasciptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJavaSE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");

		String xp = "//h2[text()='15. Miscellaneous']";
		WebElement e = driver.findElement(By.xpath(xp));

		int x = e.getLocation().getX();
		System.out.println(x);

		int y = e.getLocation().getY();
		System.out.println(y);

		WebElement h = driver.findElement(By.cssSelector("header.header"));
		int height = h.getSize().getHeight();
		System.out.println(height);
		y = y - height;
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("+x+", "+y+");
		// j.executeScript("window.scrollBy("+x+", "+y+")");
		j.executeScript("window.scrollTo(" + x + ", " + y + ")");

		/*
		 * for(int i=1;i<=10;i++) { j.executeScript("window.scrollBy(0,500)");
		 * Thread.sleep(1000); } for(int i=1;i<=10;i++) {
		 * j.executeScript("window.scrollBy(0,-500)"); Thread.sleep(1000); }
		 */

	}
}
