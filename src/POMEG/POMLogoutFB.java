package POMEG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogoutFB {
	@FindBy(xpath="//span[text()='Log Out']/../..")
	private WebElement logoutBTN;

	@FindBy(id="pageLoginAnchor")
	private WebElement dropDown;

	public POMLogoutFB(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void CliclLogout() {
		logoutBTN.click();
}
	public void dropClick() {
		dropDown.click();
	}
}