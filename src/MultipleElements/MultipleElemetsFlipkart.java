package MultipleElements;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MultipleElemetsFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[contains(text(),'iphone x)]/..")).click();
		//driver.findElement(By.xpath("//span[text()='iphone X mobile']/..")).click();
		driver.findElement(By.xpath("//span[text()='iphone x mobile']/..")).click();
		String xp="//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allP = driver.findElements(By.xpath(xp));
		//ArrayList<Integer> pr=new  ArrayList<Integer>();
		TreeSet<Integer> t=new TreeSet<Integer>();
		System.out.println("-------all prices-----");
		for (WebElement p : allP) {
			String strPrice=p.getText().substring(1).replaceAll(",", "");
			//System.out.println(strPrice);
			int v = Integer.parseInt(strPrice);
			t.add(v);
		}
		System.out.println("---Low and High Prices---");
	//	Collections.sort(pr);
		//System.out.println(pr);
		System.out.println(t.first());
		System.out.println(t.last());
		driver.close();
			
		}
		
			
		}
		
		
	


