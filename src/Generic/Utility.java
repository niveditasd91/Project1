package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static void writeResultToXL(String path,int passcount,int failcount,int skipcount) {
		try {
			Workbook w=WorkbookFactory.create(new FileInputStream(path));
			w.getSheet("Sheet1").getRow(1).getCell(0).setCellValue(passcount);
			w.getSheet("Sheet1").getRow(1).getCell(1).setCellValue(failcount);
			w.getSheet("Sheet1").getRow(1).getCell(2).setCellValue(skipcount);
			w.write(new FileOutputStream(path));
			w.close();
		}
		catch(Exception e) {
			
		}
	}

}
