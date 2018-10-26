package POMEG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginFB {
	@FindBy(id="email")
	private WebElement unTB;
	@FindBy(id="pass")
	private WebElement pwTB;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBTN;

	public POMLoginFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
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
