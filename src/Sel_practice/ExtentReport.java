package Sel_practice;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static void main(String[] args) throws Exception {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\mege\\Desktop\\Selenium\\Project\\report\\firstreport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logg=extent.createTest("main");
		logg.log(Status.INFO, "test is running");
		logg.log(Status.ERROR, "error due to some reason");
		logg.log(Status.WARNING, "warrrr");
		logg.addScreencastFromPath("C:\\Users\\mege\\Desktop\\Selenium\\Project\\screensho\\a.png");
		logg.fail("Failed due to some reason",MediaEntityBuilder.createScreenCaptureFromPath("C:\\\\Users\\\\mege\\\\Desktop\\\\Selenium\\\\Project\\\\screensho\\\\a.png").build());
		logg.log(Status.FAIL, "test failed");
		extent.flush();
		System.out.println("done");
	
	
	}

}
