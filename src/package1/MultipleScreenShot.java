package package1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		//Date d=new Date();
		Date d=new Date();
		String v = d.toString();
		System.out.println(v);
		String v2 = v.replaceAll(":", "-");//replaces : by - because colon is not supported by os
		System.out.println(v2);
		WebDriver driver =new ChromeDriver();
		driver.get("http:\\www.google.com");
		TakesScreenshot t=(TakesScreenshot)driver;
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	String path="./photo1/"+v2+".png";//creates multiple png file with date and name
	//png=portable network graphics
	System.out.println(path);
	File destFile=new File(path);
	FileUtils.copyFile(srcFile, destFile);
	driver.close();
}
}
