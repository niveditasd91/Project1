package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SlideBar {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cleartrip.com");
	   driver.findElement(By.id("FromTag")).sendKeys("bang");
	   driver.findElement(By.xpath("//a[contains(text(),'Kempegowda ')]")).click();
	   driver.findElement(By.id("ToTag")).sendKeys("London");
	   driver.findElement(By.xpath("//a[contains(text(),'Heathrow (LHR)')]")).click();
	   driver.findElement(By.xpath("(//a)[@class='ui-state-default '][6]")).click();
	   driver.findElement(By.id("SearchBtn")).click();
	  WebElement slide = driver.findElement(By.className("rangeHandle"));
	  int x=slide.getSize().getWidth();
	  Actions action=new Actions(driver);
	  action.clickAndHold(slide).moveByOffset(x-100, 0).release().perform();
	}

}
