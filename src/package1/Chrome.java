package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.close();
	}

}
