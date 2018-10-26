package ListBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
	// Using for loop
		
		/*  for(int i=1;i<allOptions.size();i++) {
		   WebElement option=allOptions.get(i);
		  String text=option.getText();
		  System.out.println(text); }
	}*/
	// using for each loop
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}

	}
}
	
