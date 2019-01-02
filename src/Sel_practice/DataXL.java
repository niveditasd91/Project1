package Sel_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataXL {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	//public static void main(String[] args) throws Exception, InvalidFormatException, FileNotFoundException, IOException {


	/*WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	//Dimension d=new Dimension(400, 600);
	// driver.manage().window().setSize(d);


	driver.manage().window().setPosition(new Point(50, 100));
	 */
	//-----------------------------------------------------------------------------------------------	

	static	 int newCol;static int newRow;
	public static void readXL(String cellName,String rowName) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		Workbook w=WorkbookFactory.create(new FileInputStream("./input/XL.xlsx"));
		int col=w.getSheet("Sheet1").getRow(0).getLastCellNum();
		int row = w.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<row;i++)
		{
			String value = w.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			if(rowName.equals(value))
				newRow=i;

		}		
		for(int j=1;j<col;j++)
		{

			String value1=w.getSheet("Sheet1").getRow(0).getCell(j).getStringCellValue();

			if(cellName.equals(value1)) 
			{

				newCol=j;

				String value2=w.getSheet("Sheet1").getRow(newRow).getCell(newCol).getStringCellValue();
				System.out.println(value2);


			}
		}
	}


	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		//DataXL dl=new DataXL();
		readXL("Test Data","TCOne");
	}
}

























