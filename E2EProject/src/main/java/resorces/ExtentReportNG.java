package resorces;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
     static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
	    ExtentSparkReporter reporter = new ExtentSparkReporter(path);//it is responcible to creat one html files
	    reporter.config().setReportName("Web Automation Results");
	    reporter.config().setDocumentTitle("Test Result");
	    
	    extent =new ExtentReports();//helper class help to main class attached to main class
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester","Rahul Shetty");
		return extent;
	}
}
