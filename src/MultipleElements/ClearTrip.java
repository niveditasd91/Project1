package MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com/");
		// enter bang in the from field
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		// select bangalore from auto suggestion
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		// Enter goa to the field
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		//select goa from auto suggestion
		driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
		//select todays's date in calendar
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		//driver.findElement(By.xpath("//td[@data-month='8']/a[text()='6']")).click();
		//click search button
		driver.findElement(By.id("SearchBtn")).click();
		List<WebElement> allprices = driver.findElements(By.xpath("//th[@class='price']"));
		for (WebElement price : allprices) {
			String text=price.getText();
			System.out.println("original:"+text);
			String formatedText=text.substring(1).replaceAll(",", "");
			System.out.println("formated:"+formatedText);
			int v = Integer.parseInt(formatedText);
			System.out.println("Int:"+v);
		}
		for(int i=1;i<allprices.size();i++) {
			String p1=allprices.get(i-1).getText().substring(1).replaceAll(",", "");
			String p2=allprices.get(i).getText().substring(1).replaceAll(",", "");
			int v1=Integer.parseInt(p1);
			int v2=Integer.parseInt(p2);
			System.out.println("cpmparing "+v1+" with "+v2);
			if(v1<=v2) {
				System.out.println("pass");
			}
			else {
				System.out.println("Fail..");
			}
				
		}
	//	driver.close();	
			
			
			
		
		
		
		
/*
		String s1= "Rs 9700 ";
		String s2=s1.replaceAll("Rs", "");
		System.out.println(s1);
		System.out.println(s2);*/
	}
	}
