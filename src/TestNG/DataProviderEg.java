package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEg {
//Using String	
	/*@DataProvider
	public String[][] getData() {
		String[][] data=new String[1][1];
		data[0][0]="User A";
		return data;
		
	}
	@Test(dataProvider="getData")
	public void createUser(String un) {
		Reporter.log("Create User:"+un, true);*/
	
//if the requirement is that it should accept string as well as data den declare two dimensional array as object	
//Using Object Class
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][2];
		data[0][0]="User A";
		data[0][1]=123;
		
		data[1][0]="User B";
		data[1][1]=456;
		return data;
		
	}
	@Test(dataProvider="getData")
	public void createUser(String un,int pw) {
		Reporter.log("Create User:"+un+" pw:"+pw, true);
		
	}

}
