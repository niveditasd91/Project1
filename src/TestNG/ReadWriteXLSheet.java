package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadWriteXLSheet {
	@Test // Reading XL content
	public void XlTest() throws Exception, InvalidFormatException, FileNotFoundException, IOException {
		Workbook w = WorkbookFactory.create(new FileInputStream("./input/book1.xlsx"));

		String v = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String v1 = w.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(v + " " + v1);

		w.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("bhanu");
		w.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("Sir");
		w.write(new FileOutputStream("./input/book2.xlsx"));
		w.close();

	}
}
