package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActitimeLogin {
	static{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}



	public static void main(String[] args) throws InterruptedException {

		//I.open the browser
		WebDriver driver=new ChromeDriver();

		//II.enter the url
		driver.get("https://demo.actitime.com/login.do");

		//III.verify login page is displayed
		//checkpoint 1)verify title
		String expectedTitle="actiTIME - Login";
		System.out.println("Expected title= "+expectedTitle);

		String actualTitle=driver.getTitle();
		System.out.println("Actual title= "+actualTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass:title is matching");

		}
		else
			System.out.println("Fail:title is not matching");

		//check point 2)verify elements r present or not
		//username
		WebElement userName=driver.findElement(By.id("username"));
		if(userName.isDisplayed())
		{
			System.out.println("pass:username TF displayed");

		}
		else
			System.out.println("fail:username TF not displayed");
		//password
		WebElement password=driver.findElement(By.name("pwd"));
		if(userName.isDisplayed())
		{
			System.out.println("pass:password TF displayed");

		}
		else
			System.out.println("fail:password TF not displayed");

		//login button
		WebElement loginb=driver.findElement(By.xpath("//div[text()='Login ']"));
		if(loginb.isDisplayed())
		{
			System.out.println("pass:login button displayed");

		}
		else
			System.out.println("fail:login button not displayed");

		//enter the username and enter  the pw n click on login button
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(1000);
		String  eHPTitle="actiTIME - Enter time-Track";
		String aHPTitle=driver.getTitle();
		if( eHPTitle.equals(aHPTitle))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");





	}
}


