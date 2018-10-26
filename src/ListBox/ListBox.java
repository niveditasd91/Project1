package ListBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

public class ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//listBox in sorted order	
		/*	WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText=new ArrayList<String>();
		for(WebElement option:allOptions) {
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for (String text : allText) {
			System.out.println(text);
		}

		}
		 */
		
		
	//check whether list box is sorted or not
		/*WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText1=new ArrayList<String>();
		for(WebElement option:allOptions) {
			allText1.add(option.getText());
		}
		List<String> allText2=new ArrayList<String>(allText1);
		Collections.sort(allText2);
		System.out.println(allText1);
		System.out.println(allText2);
		if(allText1.equals(allText2)) {
			System.out.println("LB is in sorted order");
		}
		else
		{
			System.out.println("LB is not in sorted order");
		}
*/
		
		
	//count the number of options present in the list box
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText=new ArrayList<String>();
		for(WebElement option:allOptions) {
			allText.add(option.getText());
		}
		System.out.println(allText);
		System.out.println(allText.size());

	}
}
