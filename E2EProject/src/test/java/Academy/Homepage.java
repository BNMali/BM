package Academy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Landingpage;
import resorces.base;

public class Homepage extends base {

	@BeforeTest
	public void start() throws IOException
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();	
	}
	
	

	@Test(dataProvider= "getData")
	 public void basePageNavigation(String Username,String Password) throws IOException
	 {
//		driver= initializeDriver();
//		driver.get(prop.getProperty("url"));
//		driver.manage().window().maximize();
		Landingpage ln=new Landingpage(driver);
		ln.getExport().click();//similar to driver .find element
		ln.getlogin().click();
		ln.getoffice().click();
		Landingpage l=new Landingpage(driver);
		l.getemail().sendKeys(Username);
		l.getnext().click();
		WebElement name=driver.findElement(By.xpath("//input[@id='i0116']"));
		
//		name.sendKeys("courseName");
//		File file =name.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("logo.png"));
//		System.out.println(name.getRect().getDimension().getHeight());
//		name.getAttribute(Username);
		
		l.getpassword().sendKeys(Password);
        l.getsigin1().click();
        l.getstayin().click();
        l.getaddattendance().click();
        String abc=l.getSeries().getAttribute("value");
        System.out.println(abc);
       
        //l.getSeries().getText();
       String efg=l.getAtendate().getAttribute("value");
       System.out.println(efg);
       String hij=l.getEmpoye().getAttribute("value");
       System.out.println(hij);
       String klm=l.getCompany().getText();
       System.out.println(klm);
       String klm1=l.getTital().getText();
       System.out.println(klm1);
       //Assert.assertEquals(l.getTital().getText(),"New Attendance");
      // Assert.assertEquals(l.getTital().getText(),"New Attendance");
       Assert.assertTrue(l.getTital().isDisplayed());
       
       //driver.close();
       
     //System.out.println(driver.findElements(By.xpath("//div[@class='row form-section card-section visible-section']").getA
	 }
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//0th row
		Object[][] date=new Object[2][2];
		date[0][0]="bhagyashri3232.m@systenics.net";
		date[0][1]="vishal@123";
		
		
	//1st row
		date[1][0]="bhagyashri.m@systenics.net";
	date[1][1]="shal@123";
//		
		
		return date;            
	}
	
}
