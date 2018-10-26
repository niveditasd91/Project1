package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class HandlingMultipleFiles {
	@Test
	public static void testGrid() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./input/data.properties"));
		String v=p.getProperty("city");
		System.out.println(v);
	}

}
