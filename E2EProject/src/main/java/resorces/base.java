package resorces;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
//1500tc
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		prop=new Properties();//this is resposble to pull the object
		//FileInputStream fis=new FileInputStream("create by new>other(*select wizart(general>file(give file name))>select file >right click>proparty(copy the path)")
		FileInputStream fis=new FileInputStream("C:\\Users\\BhagyashriMali\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		
		//prop as object ,load is the method which take fis as arrgument
		prop.load(fis);
		//goes and pulles out this file of the browser
		String browserName=prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\BhagyashriMali\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\BhagyashriMali\\Downloads\\edgedriver_win32\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
			
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	
	public String getScreenShortPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		String destinationFile = System.getProperty("user.dir")+"\\reports\\1.png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	} 
}
