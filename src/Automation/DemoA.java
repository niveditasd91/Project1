package Automation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void test() {
		Reporter.log("Hi", true);
	}

}
