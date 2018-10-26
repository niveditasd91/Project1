package Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.Utility;
import GenericArchitect.BaseTest;
import GenericArchitect.WebGeneric;
import page.DashBoardPage;
import page.LoginPage;

public class OrangeTC1 extends BaseTest {
@Test(priority=1,groups= {"smoke"})
public void testA() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
	//take the input data from excel file
	
	
	Reporter.log("Helloooooooo", true);
String un=GenericArchitect.Utility.getXLData(DATA_PATH, "Sheet1", 1, 0);
String pw=GenericArchitect.Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);


String homePageURL=GenericArchitect.Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
String loginPageURL=GenericArchitect.Utility.getXLData(DATA_PATH, "Sheet1", 1, 3);
//enter valid username,password,click login
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.clickLogin();
//	WebGeneric.verifyURL(driver, lngETO, homePageURL);
	
	//verify that dashboard page is dispalyed
	
	
	//click welcome and logout
	DashBoardPage db=new DashBoardPage(driver);
	db.clickWelcome();
	db.clickLogout(lngETO);
	//WebGeneric.verifyURL(driver, lngETO, loginPageURL);

	//verify that login page is displayed
}
}
