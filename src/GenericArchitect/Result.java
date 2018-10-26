package GenericArchitect;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements IAutoConst,ITestListener{
public static int passcount=0,failcount=0;
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is pass ",true);
		passcount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Pass ",true);
		failcount++;
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Pass :"+passcount, true);
		Reporter.log("Fail :"+failcount, true);
		Utility.writeResultToXL(RES_PATH,passcount,failcount);
		
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	

}
