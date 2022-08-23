import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class onebeta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String dateTime ="12/07/2014 2:00 PM";
		//WebDriver driver = null;
			// TODO Auto-generated method stub
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = null;
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			driver.get("https://onebeta.systenics.com/app/timesheet/TS-2022-06197");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-sm\"]")).click();
			driver.findElement(By.cssSelector("div.login-button-wrapper")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control[name='loginfmt']")));
			
			driver.findElement(By.cssSelector("input.form-control[name='loginfmt']")).sendKeys("bhagyashri.m@systenics.net");
			driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
			driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("vishal@123");
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".app-logo")));
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".app-logo")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.widget[data-widget-name='bccdbca5ba']")));
			driver.findElement(By.cssSelector("div.widget[data-widget-name='bccdbca5ba']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-fieldname='total_hours']")));
			
			// WebElement element = driver.findElement(By.xpath("//div[@class='field-area']/div[@data-fieldname='activity_type']"));
//	          //String text = element.getText();
			Actions act =  new Actions(driver);
//		//WebElement move=driver.findElement(By.xpath("//input[@placeholder='Activity Type']]"));
			
		act.moveToElement(driver.findElement(By.xpath("//div[@data-fieldname='total_hours']")));
		act.build().perform();
	
	//driver.findElement(By.xpath("//input[@placeholder='Activity Type']")).getText();			//move to specfic element
		
//		
		
			
	    driver.findElement(By.xpath("(//div[@data-fieldname=\"activity_type\"])[2]")).click();	
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-fieldname=\"activity_type\"])[2]")));
		//driver.findElement(By.xpath("(//div[@data-fieldname=\"activity_type\"])[2]")).sendKeys("Auto");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-fieldname=\"activity_type\"])[2]")));
	List<WebElement>options= driver.findElements(By.cssSelector("p[title='Automation']"));
		
			for(WebElement select : options)	  
			{
	  if(select.getText().equalsIgnoreCase("Automation"))
		  
	      {
		  select.click();
      break;
      
	      		      
		     }
	}
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-fieldtype='Datetime'])[3]")));
			//driver.findElement(By.xpath("(//div[@data-fieldtype='Datetime'])[3]")).click();	
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@data-fieldtype='Datetime'])[3]"))));
			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//div[@data-fieldtype='Datetime'])[3]")).sendKeys("12-08-2022");	
			//driver.findElement(By.xpath("//input[@placeholder='Activity Type']")).sendKeys("Automation");	
			
	        // driver.switchTo().driver.findElement(By.xpath("//div[@class='data-row row'])[2]"));
	         //driver.findElement(By.xpath("//input[@placeholder='Activity Type']")).sendKeys("Automation");
		      WebElement selectDate = driver.findElement(By.xpath("(//div[@data-fieldtype='Datetime'])[3]"));
		      selectDate.click();
			
 }
}		 
		   
	
