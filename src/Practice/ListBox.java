package Practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	static
	{
		System.setProperty("webdriver.chome.driver", "./driver.chromedriver.exe");
	}
	public static void main(String[] args) {
		//MyHotel listBox	
		/*WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/MyHotel.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement listBox = driver.findElement(By.id("SLV"));
	Select select=new Select(listBox);
	select.selectByIndex(0);
	select.selectByValue("v");
		//get all selected options
	 java.util.List<WebElement> a = select.getAllSelectedOptions();
	System.out.println(a.size());

	WebElement b = select.getFirstSelectedOption();
	System.out.println("1st selected option is= "+b.getText());


	java.util.List<WebElement> c = select.getOptions();
	for (WebElement options : c) {
		System.out.println(options.getText());
	}
		if(select.isMultiple()) {
			System.out.println("Yes we can deselct");
			select.deselectByIndex(0);
			select.deselectByValue("v");
		}
		else {
			System.out.println("we cannot deselect the listbox");
		}

		 */

//listbox Facebook		
		/*	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	WebElement listbox = driver.findElement(By.id("month"));
	Select select=new Select(listbox);
	java.util.List<WebElement> allOptions = select.getOptions();
	java.util.List<String> fb=new ArrayList<String>();
	System.out.println(allOptions.size());
	for (WebElement options : allOptions) {
		System.out.println(fb.add(options.getText()));

	}
	Collections.sort(fb);
	for (String text : fb) {
		System.out.println(text);

	}
		 */
		
//check ehether the listbox issorted or not
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		java.util.List<WebElement> allOptions = select.getOptions();
		java.util.List<String> alltext1=new ArrayList<String>();
		for (WebElement options : allOptions) {
			String text = options.getText();
			alltext1.add(text);
		}
		java.util.List<String> alltext2=new ArrayList<String>();	
		for (WebElement options : allOptions) {
			String text = options.getText();
			alltext2.add(text);
		}
		Collections.sort(alltext2);
		if(alltext1.equals(alltext2)) {
			System.out.println("listbox is in sorted order");
		}
		else
		{
			System.out.println("listbox isnotin sorted order");
		}
		*/

//count the number of options present in the listbox
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		java.util.List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		*/
//ListBox is single select or multiselect		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		if(select.isMultiple())
			System.out.println("Listbox is Multi Select");
		else
			System.out.println("listbox is single select");
		driver.close();*/
	
//Print the content of listbox
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		java.util.List<WebElement> alltext = select.getOptions();
		for (WebElement text : alltext) {
			System.out.println(text.getText());
		}
*/
//print the content of listbox 	
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		java.util.List<WebElement> allOptions = select.getOptions();
		java.util.List<String> text=new ArrayList<String>();
		for (WebElement option : allOptions) {
			String tx = option.getText();
			text.add(tx);
		}
		Collections.sort(text);
		System.out.println(text);
		*/
		
//to check whether listbox is empty
	/*WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement listBox = driver.findElement(By.id("month"));
	Select select=new Select(listBox);
	java.util.List<WebElement> allOptions = select.getOptions();
	int count=allOptions.size();
	if(count==0) 
		System.out.println("listbox is empty");
	else
		System.out.println("listbox is not empty");
 
		
		*/
		
//to check whether list box is sorted or not		
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		java.util.List<WebElement> allOptions = select.getOptions();
	    java.util.List<String> alltext1=new ArrayList<String>();
	for (WebElement options : allOptions) {
		String text1=options.getText();
		alltext1.add(text1);
	}
	System.out.println(alltext1);
	
	java.util.List<String> alltext2=new ArrayList<String>();
	alltext2.addAll(alltext1);
	Collections.sort(alltext2);
	System.out.println(alltext2);
	if(alltext1.equals(alltext2)) 
		System.out.println("listbox is in sorted order");
		else
			System.out.println("listbox is not in sorted order");
	*/
		
/*//print the options present in listbox with their occurrence	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		java.util.List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for (WebElement options : allOptions) {
	    String key=options.getText();
	    if(map.containsKey(key)) {
	    	Integer value = map.get(key);
	    	value++;
	    }
	    else
	    	map.put(key, 1);
	}
		System.out.println(map);	
		*/
		
	//check whether the listbox is empty or not
		/*WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select=new Select(listbox);
		java.util.List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());
		if(allOptions.isEmpty())
			System.out.println("Listbox is empty");
		else
		System.out.println("Listbox is not empty");
		}*/

		
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/mege/Desktop/SLV.html");
//	driver.findElement(By.id(id))

	
		
		
	}}
			
		
		
		
		
	
		
		
		
		
		
		
	




