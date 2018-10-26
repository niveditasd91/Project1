package PopUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http:\\www.naukri.com");
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		File f=new File("./cv/niveditacv.3yrs.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		String msg=driver.findElement(By.className("success")).getText();
		System.out.println(msg);
		
}
}