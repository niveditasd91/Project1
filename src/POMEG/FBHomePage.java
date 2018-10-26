package POMEG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBHomePage {

	private WebElement logoutBTN;
	

	public FBHomePage(WebDriver driver) {
		
		 logoutBTN=driver.findElement(By.xpath("//span[text()='Log Out']/../.."));
	}


	public void CliclLogout() {
		logoutBTN.click();
	}
}
