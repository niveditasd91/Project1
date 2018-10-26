package Generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements ITestListener {
	static int passcount=0,failcount=0,skipcount=0;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+"is pass", true);
		passcount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+"is fail", true);
		failcount++;		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+"is skipped", true);
		skipcount++;		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("pass="+passcount,true);
		Reporter.log("fail="+failcount,true);
		Reporter.log("skip="+skipcount,true);
		Utility.writeResultToXL("./result/summary.xlsx",passcount,failcount,skipcount);
		
	}

}
