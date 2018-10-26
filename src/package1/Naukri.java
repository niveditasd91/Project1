package package1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//driver.get("http:\\www.naukri.com");
		//driver.quit();
		//driver.get("http:\\google.com");
		//------------------------------------------------------
		driver.navigate().to("http:\\www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//-----------------------------------------------------
		/*driver.manage().deleteAllCookies();
		driver.manage().window().maximize();*/
		//-----------------------------------------------------
		/*driver.get("http:\\demo.actitime.com");
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("Nivedita");*/
		//-----------------------------------------------------
		/*System.out.println(driver);
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.close();*/
		//-------------------------------------------------
		driver.get("http:\\www.naukri.com");
		//driver.get("http:\\www.google.com");

		/*Set<String> v = driver.getWindowHandles();
		System.out.println(v.size());
		System.out.println();*/
	}

}
