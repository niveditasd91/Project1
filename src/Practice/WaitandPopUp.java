package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitandPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {


		//gmail login
		/*WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://www.gmail.com");

	//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.id("identifierId")).sendKeys("niveditasd91@gmail.com");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	//driver.findElement(By.id("identifierNext")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Megha@91");
	p.sendKeys("Megha@91");
	r.keyPress(KeyEvent.VK_ENTER);
//	 WebElement pass = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][1]"));
//	 Thread.sleep(2000);
//	pass.sendKeys("");
//	//driver.findElement(By.id("passwordNext")).click();
//	
		 */		
		//gmail login
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("niveditasd91@gmail.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		p.sendKeys("Megha@91");
		r.keyPress(KeyEvent.VK_ENTER);*/
		 
//-------------------------------------Wait----------------------------------------------------------------------

		//ExplicitWait
		/*	WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

		driver.findElement(By.id("logoutLink")).click();
		 */


		//Implicit Wait
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		 */

		//custom wait
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		for(int i=0;i<=100;i++) {
			String title=driver.getTitle();
			if(title.contains("Enter")) {
				System.out.println(title);
				break;
			}
			else
			{
				System.out.println("still in login page-->"+i);
			}
		}
		driver.findElement(By.id("logoutLink")).click();
		 */
		//custom Wait while	
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		while(true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout link is present and clicked");
				break;
			}
			catch(Exception e) {
				System.out.println("logout link is not present");
			}
		}*/
//------------------------------------------POP UPs----------------------------------------------------		
	//HiddenDivisionPOPUp	
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.id("nqame2")).sendKeys("p123");
		driver.findElement(By.id("cust-dob")).click();
		driver.findElement(By.xpath("(//a)[@class='dtcolor'][20]")).click();
		driver.findElement(By.id("proceed")).click();

		*/
		
	//JavaScriptPOPUp	
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.findElement(By.id("loginbutton")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//to press ok
		//alert.dismiss();//to press cancel
		
		*/
		
		
	//Child Browsers
		/*WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.naukri.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("block")).click();
		Set<String> allWHS = driver.getWindowHandles();
		//System.out.println(allWHS);
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
	*/
	//count no of child browsers and print the title of all browsers
		/*WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.naukri.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("block")).click();
		Set<String> allWHS = driver.getWindowHandles();
		
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			String chtit = driver.getTitle();
			System.out.println(chtit);
		}
		System.out.println(allWHS.size());
		driver.close();
		*/
		
		
	//close all the browsers except parent	
	/*	WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.naukri.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("block")).click();
		String parent=driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		for (String wh : allWHS) {
			String title=driver.getTitle();
			
			if(title.equals("Amazon")) {
				driver.close();
				}
			*/
		
		
		
		
	//Notification PopUp
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("http://www.yatra.com");
		
		
		*/
		
	//print Pop UP	
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//a[text()='NO, THANKS']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		*/
		
	//fileupload and down load pending
		
		
//--------------------------------------------------------ScreenShot----------------------------------------------------		
	//single screenShot	
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/b.png");
		FileUtils.copyFile(srcFile, destFile);
		*/
			
	//Multiple SCreenShot
	java.util.Date d=new java.util.Date();
		String v = d.toString();
		System.out.println(v);
		String nv=	v.replaceAll(":", "-");
		System.out.println(nv);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+nv+".png";
		File destFile=new File(path);
		System.out.println(path);
		FileUtils.copyFile(srcFile, destFile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


