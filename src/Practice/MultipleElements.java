package Practice;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleElements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/findEle.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		allLinks.get(1).click();*/

		//print the no of links present on the web page	
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);*/

		//	print the text and url present on the web page	
		/*	WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/findEle.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement al : allLinks) {
		String text = al.getText();	
		String url = al.getAttribute("href");
		System.out.println(text);
		System.out.println(url);
		}
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement link = allLinks.get(i);
			String text = link.getText();
			String url = link.getAttribute("href");
			System.out.println(text+"--> "+url);*/

		//Autosuggestion google
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		System.out.println(allLinks.size());
		allLinks.forEach((e) -> System.out.println(e.getText()));
		allLinks.get(0).click();*/
		
		/*for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		allLinks.get(0).click();
		driver.close();

*/
		
	
		
//trivago autosuggestion		
			
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.trivago.com");
	    driver.findElement(By.id("horus-querytext")).sendKeys("b");
	    List<WebElement> allLinks = driver.findElements(By.xpath("//span[@class='ssg-title']"));
	    System.out.println( allLinks.size());
		for (WebElement link : allLinks) {
			String text = link.getText();
			System.out.println(text);
		
		}
		driver.findElement(By.xpath("(//span)[@class='ssg-title'][3]")).click();
		
		
		*/
//cleartrip	autosuggestion
	/*	ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://www.cleartrip.com");	
	driver.manage().window().maximize();
	driver.findElement(By.id("FromTag")).sendKeys("bang");
	driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
	driver.findElement(By.id("ToTag")).sendKeys("Goa");
	driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
	driver.findElement(By.xpath("(//a)[@class='ui-state-default '][1]")).click();
	driver.findElement(By.id("SearchBtn")).click();
	List<WebElement> allprice = driver.findElements(By.xpath("//th[@class='price']"));
	for (WebElement price : allprice) {
		String text=price.getText();
		System.out.println("original "+text);
		String formatedtext=text.substring(1).replaceAll(",", "");
		System.out.println(formatedtext);
	}
		for (int i=1;i<allprice.size();i++) {
			String p1=allprice.get(i-1).getText().substring(1).replaceAll(",", "");
			String p2=allprice.get(i).getText().substring(1).replaceAll(",", "");
			int v1=Integer.parseInt(p1);
			int v2=Integer.parseInt(p2);
			System.out.println("cpmparing "+v1+" with "+v2);
			if(v1<v2) {
				System.out.println("pass");
		}
			else
				System.out.println("fail");
	}*/
		
		
//flipKart autosuggestion		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone x");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[@class='_2kpuIQ'])[3]")).click();
//	 WebElement text = allLinks.get(1);
//	 ystem.out.println(text.getText());
		/*String xp="//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allprice = driver.findElements(By.xpath(xp));
		TreeSet<Integer> t=new TreeSet<Integer>();
		for (WebElement allp : allprice) {
			String price=allp.getText().substring(1).replaceAll(":", "");
			int pr=Integer.parseInt(price);
			t.add(pr);
			
		}
		System.out.println(t.first());
		System.out.println(t.last());
		
		*/
		
		
		
		
		
	}
	}	








	