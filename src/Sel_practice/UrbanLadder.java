package Sel_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UrbanLadder {
	static
	{
		System.setProperty("webdriver/chrome.driver", "./driver.chromedriver.exe");

	}
	
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.urbanladder.com");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		System.out.println("SALE");
		WebElement Living = driver.findElement(By.xpath("(//span[contains(text(),'Sale')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(Living).perform();
		Thread.sleep(1000);
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']"));
		for (WebElement ele : allEle) {
			System.out.println(ele.getText());
		}
		System.out.println("<----------Living------->");
		WebElement living = driver.findElement(By.xpath("(//span[contains(text(),'Living')])[1]"));
		action.moveToElement(living).perform();
		Thread.sleep(2000);
		List<WebElement> sofa = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[1]"));
		System.out.println("--------SOFA----------");
		for (WebElement ele : sofa) {
			System.out.println(ele.getText());

		}
		System.out.println("--------CHAIRS----------");
		List<WebElement> chairs = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[2]"));
		for (WebElement ele : chairs) {
			System.out.println(ele.getText());
		}
		System.out.println("---------Tables----------");
		List<WebElement> tables = driver.findElements(By.xpath("//div[@class=\"subnavlist_wrapper clearfix\"]/ul/li[3]"));
		for (WebElement ele : tables) {
			System.out.println(ele.getText());
		}
		System.out.println("--------Bedroom------------");
		WebElement bed = driver.findElement(By.xpath("(//span[contains(text(),'Bedroom')])[1]"));
		action.moveToElement(bed).perform();
		List<WebElement> broom = driver.findElements(By.xpath("(//li[@class=\"topnav_item bedroomunit\"])/div/div/ul/li"));
		for (WebElement bedroom : broom) {
		System.out.println(bedroom.getText());
		
	}
		System.out.println("-------MATTRESS------------");
		List<WebElement> matress = driver.findElements(By.xpath("(//li[@class=\"topnav_item bedroomunit\"])/div/div/ul/li[2]"));
		for (WebElement bedroom : matress) {
		System.out.println(bedroom.getText());
		}
	}
}*/



/*
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.urbanladder.com");
	WebElement close = driver.findElement(By.xpath("//a[contains(text(),'Close')]"));
	if(close.isDisplayed()) {
		close.click();
	}
	Thread.sleep(2000);
	WebElement sale = driver.findElement(By.xpath("(//span[contains(text(),'Living')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(sale).perform();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='Fabric Sofa Sets']/..")).click();
}}*/











	
	@Test
	public static void urban() throws Exception {
		// TODO Auto-generated method stub
		// WebDriver driver1=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		List<WebElement> outerList = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));

		String xp = "//span[@class='topnav_itemname']";
		// WebElement
		// sales=driver.findElement(By.xpath("//li/span[contains(text(),'Sale')]"));
		Actions actions = new Actions(driver);
		int row = 0;
		for (int i = 0; i < outerList.size(); i++)
		{
			WebElement mainMenu = outerList.get(i);
			actions.moveToElement(mainMenu).perform();
			System.out.println(mainMenu.getText());
			String v = mainMenu.getText();
			wait.until(ExpectedConditions.visibilityOfAllElements(outerList));
			Assert.assertEquals(readFromXl(row, 0), v);
			writeToXl(row, v);
			row++;
			Thread.sleep(50);
			// List<WebElement> lst =
			// driver.findElements(By.xpath("(//div[@class='subnavlist_wrapper
			// clearfix'])"));
			List<WebElement> lst = driver.findElements(By.xpath(
					"//div[@id='topnav_wrapper']/ul/li/span[contains(text(),'" + mainMenu.getText() + "')]/../div//a"));
			// System.out.println(lst.size());
			for (int j = 0; j < lst.size(); j++) {
				WebElement submenu = lst.get(j);
				// System.out.println(submenu.getText());
				String v1 = submenu.getText();
				// Thread.sleep(5000);
				System.out.println(v1);
				Assert.assertEquals(readFromXl(row, 0), v1);
				wait.until(ExpectedConditions.visibilityOfAllElements(lst));
				writeToXl(row++, v1);
			}
		}
	}

	public static void writeToXl(int r, String v) throws Exception {
		Workbook w = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
		w.getSheet("Sheet1").getRow(r).createCell(1).setCellValue(v);
		Thread.sleep(50);
		w.write(new FileOutputStream("./input/data.xlsx"));
		int noOfCol = w.getSheet("Sheet1").getRow(r).getLastCellNum();
		// System.out.println(noOfCol);

	}

	public static String readFromXl(int r, int col) throws Exception {
		Workbook w = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
		String act = w.getSheet("Sheet1").getRow(r).getCell(col).getStringCellValue();
		int noofrows = w.getSheet("Sheet1").getLastRowNum();
		// System.out.println(noofrows);
		return act;
		/*
		 * //System.out.println(noOfColumns); String[] Headers = new
		 * String[noOfColumns]; for (int j=0;j<noOfColumns;j++){ Headers[j] =
		 * sheet.getRow(0).getCell(j).getStringCellValue(); }
		 */
	}

	@DataProvider
	public static Object[][] getExcelData() throws Exception, Exception, FileNotFoundException, IOException {
		// Object[][] arrayExcelData = null;
		Workbook w = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));

		int totalNoOfRows = w.getSheet("Sheet1").getLastRowNum();
		int totalNoOfCols = w.getSheet("Sheet1").getRow(0).getLastCellNum();
		Object[][] arrayExcelData = new Object[totalNoOfRows][totalNoOfCols];
		for (int i = 0; i < totalNoOfRows; i++) {
			for (int j = 0; j < totalNoOfCols; j++) {
				arrayExcelData[i][j] = w.getSheet("Sheet1").getRow(i + 1).getCell(j).getStringCellValue();

			}
		}
		return arrayExcelData;
	}

	@Test(dataProvider = "getExcelData")
	 static void assertData(String s1,String s2){
		Assert.assertEquals(s1, s2);
		
	}
	
}

