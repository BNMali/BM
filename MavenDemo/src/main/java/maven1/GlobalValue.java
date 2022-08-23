package maven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Properties pro=new Properties();
       FileInputStream fis =new FileInputStream("C:\\Users\\BhagyashriMali\\eclipse-workspace\\MavenDemo\\data.properties");
	pro.load(fis);
	System.out.println(pro.getProperty("browser"));
	
	System.out.println( pro.getProperty("url"));
	pro.setProperty("browser", "firefox");
	System.out.println(pro.getProperty("browser"));
	FileOutputStream fos =new FileOutputStream("C:\\\\Users\\\\BhagyashriMali\\\\eclipse-workspace\\\\MavenDemo\\\\data.properties");
	pro.store(fos, null);//store method store the file
	}

}
