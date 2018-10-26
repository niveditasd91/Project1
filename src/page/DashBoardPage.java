package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericArchitect.WebGeneric;

public class DashBoardPage {
	private WebDriver driver;
	@FindBy(id="welcome")
	private WebElement welcome;
	
	@FindBy(xpath="//li/a[.='Logout']")
	private WebElement logout;
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickWelcome() {
		welcome.click();
	}

	
	public void clickLogout(long time) {
		WebGeneric.waitForVisibilityAndClick(driver, time, logout);
	}

}
