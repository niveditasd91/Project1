package GenericArchitect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(Result.class)
public abstract class BaseTest implements IAutoConst {
	static{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	
	public WebDriver driver;
	public String url=Utility.getPropertyValue(CONFIG_PATH,"URL");
	public String ITO=Utility.getPropertyValue(CONFIG_PATH,"ITO");
	public long lngITO=Long.parseLong(ITO);
	public String ETO=Utility.getPropertyValue(CONFIG_PATH,"ETO");
	public long lngETO=Long.parseLong(ETO);

	@Parameters({"ip","browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApp(@Optional("localhost")String ip,@Optional("chrome")String browser){
		driver=Utility.openBrowser(ip, browser);
		driver.manage().timeouts().implicitlyWait(lngITO,TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod(alwaysRun=true)
	public void closeApp(ITestResult result){
		String name=result.getName();
		int status = result.getStatus();
		if(status==2){
			String p = Utility.getPhoto(driver,"./photo");
			Reporter.log("TestName:"+name +" Status:FAIL",true);
			Reporter.log("PHOTO:"+p,true);
		}
		else{
			Reporter.log("TestName:"+name +" Status:PASS",true);
		}
		driver.quit();
	}
}


