package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"city","area"})
	@Test
	public void testA(@Optional("Delhi")String c,@Optional("market")String a) {
		Reporter.log(c + a, true);
	}
	

	
	/*@Parameters({"city","area"})
	@Test
	public void testA(String c,String a) {
		Reporter.log(c+a, true);
	}
	*/
}
