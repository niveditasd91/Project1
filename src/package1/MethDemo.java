package package1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MethDemo {
	static{
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
		
		public static void myTest(WebDriver driver)
		{
			driver.get("http://www.google.com");
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			//print html code(source code) of a web page
			driver.get("http://www.google.com");
			String src=driver.getPageSource();
			System.out.println(src);
			
			//get the url presen in address bar
			String url=driver.getCurrentUrl();
			System.out.println(url);
			driver.quit();

	}
	}



