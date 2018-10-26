package POMEG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLogin {
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;

	public FBLogin(WebDriver driver) {
		unTB = driver.findElement(By.id("email"));
		pwTB = driver.findElement(By.id("pass"));
		loginBTN = driver.findElement(By.xpath("//input[@value='Log In']"));
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}

	public void clickLogin() {
		loginBTN.click();

	}

}
