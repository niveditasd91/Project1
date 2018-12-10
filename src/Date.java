import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	static
	{
		System.setProperty("webdriver,chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.goibibo.com/");
		LocalDate time=LocalDate.now();
		LocalDate  date1=time.plusDays(30);
		int departDate=date1.getDayOfMonth();
		LocalDate date2=date1.plusDays(50);
		int returnDate=date2.getDayOfMonth();
		driver.findElement(By.xpath("(//input[contains(@placeholder,'choose')])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='"+departDate+"'])[2]")).click();
		driver.findElement(By.xpath("(//input[contains(@placeholder,'choose')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton')]")).click();
		driver.findElement(By.xpath("//div[text()='"+returnDate+"'])[2]")).click();
		driver.close();*/

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.goibibo.com/");
		LocalDate time=LocalDate.now();
		LocalDate date1=time.plusDays(30);
		int  departDate=date1.getDayOfMonth();
		LocalDate date2=time.plusDays(50);
		int returnDate=date2.getDayOfMonth();
		List<WebElement> from = driver.findElements(By.xpath("(//input[@role='combobox'])[1]"));
		for (WebElement tag : from) {
			tag.click();
			break;

		}



	}

}
