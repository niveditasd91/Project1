package package1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleEg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http:\\naukri.com");
		System.out.println(driver);
		//String wh = driver.getWindowHandle();
		//System.out.println(wh);
		Set<String> v = driver.getWindowHandles();//window handle of parent browsers 
		System.out.println(v.size());//how many windows have been opened including parent tab
		System.out.println(v);///window handle of child browsers 
		driver.close();
	}
}
