package POMEG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBDropDown {
	private WebElement dropDown;

	public FBDropDown(WebDriver driver) {
		dropDown=driver.findElement(By.id("pageLoginAnchor"));
	}
	

	public void dropClick() {
		dropDown.click();
	}
}

