package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/*private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
*/
	

	
		@FindBy(id="username")
		private WebElement unTB;
		
		@FindBy(name="pwd")
		private WebElement pwTB;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginBTN;
		
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
		/*
		 	public LoginPage(WebDriver driver) {
		  unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.name("pwd"));
		loginBTN = driver.findElement(By.xpath("//div[.='Login ']"));*/
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
