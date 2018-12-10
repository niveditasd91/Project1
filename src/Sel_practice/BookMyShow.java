package Sel_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.scene.control.ScrollToEvent;

public class BookMyShow {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.bookmyshow.com");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='__top-cities']/ul/li[3]"))).click();
		driver.findElement(By.id("wzrk-cancel")).click();
		/*WebElement e = driver.findElement(By.xpath("(//h4[text()='Badhaai Ho'])[2]"));
		int x=	e.getLocation().getX();
		int y=e.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo("+x+", "+y+")");*/
		WebElement element = driver.findElement(By.xpath("(//a[text()='Movies'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		//driver.findElement(By.xpath("(//a[text()='Movies'])[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showcase-primary\"]/div[1]/div/div/div[3]/div/a"))).click();
		//driver.findElement(By.xpath("//*[@id=\"showcase-primary\"]/div[1]/div/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("//a[text()='Book Tickets']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'PVR: Vega City,')]")).click();
		driver.findElement(By.xpath("//a[@data-session-id='PVEG_20639']")).click();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
//		driver.findElement(By.id("proceed-Qty")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("proceed-Qty"))).click();
		driver.findElement(By.xpath("//div[@id='B_4_03']/a")).click();
		driver.findElement(By.xpath("(//a[@id=\"btmcntbook\"])[1]")).click();
		//driver.findElement(By.xpath("//a[text()='Proceed']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Proceed']"))).click();
		//driver.close();
	}}
