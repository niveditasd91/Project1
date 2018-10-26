package ListBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.bcel.generic.AllocationInstruction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class ListBoxSlv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	//check whether the listbox is single select or multiselect
		/*WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);
		if(select.isMultiple()) {
			System.out.println("ListBox is multi select");
		}
		else {
			System.out.println("ListBox is single select");
		}
	*/
		
		
		
	//check whether the list box is empty	
		/*WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		if(allOptions.isEmpty()) {
			System.out.println("ListBox is empty");
		}
		else {
			
			System.out.println("ListBox is not empty");
		}*/
		
		
		
	//select and deselect all the options in reverse order
		/*WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			select.selectByIndex(i);
		}
		for (int i = allOptions.size()-1; i>=0; i--) {
			select.deselectByIndex(i);
		}
		*/
		
		
	//Print the content of listBox
		/*WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText=new ArrayList<String>();
		for (WebElement option : allOptions) {
			allText.add(option.getText());
		}
		System.out.println(allText);
		*/
		
		
		
		
	//print the contents in sorted order
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText1=new ArrayList<String>();

		// Using for loop

//		for (int i = 1; i < allOptions.size(); i++) {
//			WebElement option = allOptions.get(i);
//			String text = option.getText();
//	        }
//			//System.out.println(text);
//			allText1.add(text);
//			Collections.sort(allText1);
//			System.out.println(allText1);
//		

		// using for each loop
		for (WebElement option : allOptions) {
			allText1.add(option.getText());
		}
		System.out.println(allText1);
		Collections.sort(allText1);
		System.out.println(allText1);
		
         */
		
	//count the number of options present in listbox
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText = new ArrayList<String>();
		int count = 1;
		for (int i = 1; i < allOptions.size(); i++) {
			WebElement option = allOptions.get(i);
			count++;
		}
		System.out.println(count);*/
		
	
	//check whether the contents of list box is sorted or not 	
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText1=new ArrayList<String>();
		for(WebElement option:allOptions) {
			allText1.add(option.getText());
		}
		List<String> allText2=new ArrayList<String>(allText1);
		Collections.sort(allText2);
		System.out.println(allText1);
		System.out.println(allText2);
		if(allText1.equals(allText2)) {
			System.out.println("LB is in sorted order");
		}
		else
		{
			System.out.println("LB is not in sorted order");
		}
*/
		
		
		
	// Print the options present in listBox with their occurance
      
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (WebElement option : allOptions) {
			String key = option.getText();
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
		
		
		

	// Check whether the option is duplicate in ListBox
		
		  /*WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		  WebElement listBox = driver.findElement(By.id("SLV")); 
		  Select select=new Select(listBox);
		  List<WebElement> allOptions = select.getOptions();
		  LinkedHashMap<String,
		  Integer> map=new LinkedHashMap<String, Integer>(); 
		  for (WebElement option : allOptions) { 
			  String key=option.getText(); 
			  if(map.containsKey(key)) {
				  Integer value=map.get(key);
				  value++; 
				  map.put(key, value);
				  }
			  else {
				  map.put(key, 1);
				  }
		  }
		  String s="Idly";
		  if(map.get(s)>1) {
			  System.out.println(s+" is duplicate");
		  } 
		  else {
			  System.out.println(s+" is not duplicate");
			  }
		 
		*/
		

	// Print all the options in the listBox without repeating options
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (WebElement option : allOptions) {
			String key = option.getText();
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map.keySet());
		*/
		
		
	// Print only unique options present in the ListBox
		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (WebElement option : allOptions) {
			String key = option.getText();
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key);
			}
		}*/
		

		
		
		
		
   // print only duplicate options present in the list box
	  /*WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mege/Desktop/SLV.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select = new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (WebElement option : allOptions) {
			String key = option.getText();
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key);
			}
		}*/

	
}
}