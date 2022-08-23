package bhagyashri.ExtendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import freemarker.template.utility.Execute;

public class ExtendReportDemo
{
	
	 ExtentReports extent;

	@BeforeTest
	public void config()
	{
	String path =System.getProperty("user.dir")+"\\reports\\index.html";
    ExtentSparkReporter reporter = new ExtentSparkReporter(path);//it is responcible to creat one html files
    reporter.config().setReportName("Web Automation Results");
    reporter.config().setDocumentTitle("Test Result");
    
    extent =new ExtentReports();//helper class help to main class attached to main class
    extent.attachReporter(reporter);
    extent.setSystemInfo("Tester","Rahul Shetty");
	}
	
	@Test
	public void intialDemo() throws InterruptedException
	{
		ExtentTest test=extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("https://onebeta.systenics.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		test.addScreenCaptureFromBase64String(null)
		//test.fail("Resut do not match");
		extent.flush();
	}
	
}
