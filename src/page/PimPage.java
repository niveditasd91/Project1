package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

	private WebDriver driver;
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement pim;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmp;

	@FindBy(id = "firstName")
	private WebElement firstname;

	@FindBy(id = "middleName")
	private WebElement middlename;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	@FindBy(xpath="//a[text()='Contact Details']")
	private WebElement contact;
	
	@FindBy(xpath="//input[@value='Edit']")
	private WebElement edit;
	
	@FindBy(id="contact_country")
	private WebElement select;
	
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click() {
		pim.click();
	}

	public void empClick() {
		addEmp.click();
	}

	public void setfirstname(String fn) {
		firstname.sendKeys(fn);
	}

	public void setMiddleName(String mn) {
		middlename.sendKeys(mn);
	}
	
	public void setlastname(String ln) {
		lastname.sendKeys(ln);
	}
	public void clickSave() {
		save.click();
	}
	
	public void contactClick() {
		contact.click();
	}
	
	public void editClick() {
		edit.click();
	}
	
	public void clickSelect() {
		select.click();
	}
}
