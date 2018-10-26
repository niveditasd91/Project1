package MultipleElements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsTrivago {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).sendKeys("B");
		
		List<WebElement> trip = driver.findElements(By.className("ssg-title"));
		int count=trip.size();
		System.out.println("No of cities with B is :"+count);
		for(WebElement e:trip) {
			System.out.println(e.getText());
		}
		trip.get(0).click();
		//driver.findElement(By.xpath("//time[@datetime='2018-09-06']")).click();
		//driver.findElement(By.xpath(//time[@datetime='2018-09-05'])).click();

}
}