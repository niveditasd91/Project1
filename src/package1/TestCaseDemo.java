package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseDemo {
	
static{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	
	
	public static void main(String[] args) {
		/*
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
			*/
		
		/*
		 login script for fb
		 //I.open the browser
		 
		WebDriver driver=new ChromeDriver();
		
		//II.enter the url
		driver.get("http://www.facebook.com");
		//III.verify login page is displayed or not
	    //check point 1.verify title
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Facebook – log in or sign up";
		System.out.println(expectedTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("pass:title is matching");
		}
		else
			System.out.println("fail:title not matching");
		//check point 2.verify elements displayed or not
		//email TF
		WebElement we=driver.findElement(By.id("email"));
		if(we.isDisplayed())
		{
			System.out.println("pass:email TF displayed");
		}
			else
			System.out.println("fail:email TF not displayed");
		
		//password TF
		WebElement we1=driver.findElement(By.id("pass"));
		if(we1.isDisplayed())
		{
			System.out.println("pass:password TF displayed");
		}
		else
			System.out.println("fail:password TF not displayed");
		
		//login button
		WebElement we2=driver.findElement(By.id("u_0_2"));
		if(we2.isDisplayed())
		{
			System.out.println("pass:login button displayed");
		}
		else
			System.out.println("fail:login button not displayed");
			
			*/
		//login script for gmail
		//I.open the browser
		 
				WebDriver driver=new ChromeDriver();
				
				//II.enter the url
				driver.get("https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
				//III.verify login page is displayed or not
			    //check point 1.verify title
				String actualTitle=driver.getTitle();
				System.out.println(actualTitle);
				String expectedTitle="Sign in – Google accounts";
				System.out.println(expectedTitle);
				if(expectedTitle.equals(actualTitle))
				{
					System.out.println("pass:title is matching");
				}
				else
					System.out.println("fail:title not matching");
				//check point 2.verify elements displayed or not
				//email TF
				WebElement we=driver.findElement(By.id("identifierId"));
				if(we.isDisplayed())
				{
					System.out.println("pass:email TF displayed");
				}
					else
					System.out.println("fail:email TF not displayed");
				
				 
				
				//next button
				WebElement we2=driver.findElement(By.id("identifierNext"));
				if(we2.isDisplayed())
				{
					System.out.println("pass:next button displayed");
				}
				else
					System.out.println("fail:next button not displayed");

}
}



