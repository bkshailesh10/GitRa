package global.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {
	
	public static void main(String[] args) throws IOException {
		
		Properties  prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\shailesh\\2022\\22_Testing\\22_Rahul Sel\\RaTestNGWS\\TestNGTutorial\\src\\data.properties");
		
		prop.load(file);
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("Browser", "Firefox");
		System.out.println(prop.getProperty("Browser"));
		FileOutputStream FOs = new FileOutputStream("C:\\Users\\shailesh\\2022\\22_Testing\\22_Rahul Sel\\RaTestNGWS\\TestNGTutorial\\src\\data.properties");
		prop.store(FOs, null);
	}

}
