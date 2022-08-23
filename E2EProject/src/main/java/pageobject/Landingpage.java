package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
	By Export=By.xpath("//a[contains(text(),'Explore')]");//	By signin=By.xpath("//span[contains(text(),'Login')]");
	By login=By.cssSelector("a.btn-primary "); //	By Email=By.xpath("//input[@id='user_email']"); 
	By office=By.cssSelector("div.login-button-wrapper"); //By password=By.xpath("//input[@id='user_password']");
	By email=By.xpath("//input[@id='i0116']"); //By login=By.xpath("//input[@data-disable-with='Log In']");
	By next=By.xpath("//input[@value='Next']");
	
	By password=By.xpath("//input[@id='i0118']");////input[@id='idSIButton9']
	By sigin=By.xpath("//input[@value='Sign in']");////input[@value='Yes']
	By stayin=By.xpath("//input[@value='Yes']");////div[text()='Add Attendance']
	By addattendance=By.xpath("//span[text()='Add Attendance']");////select[@data-fieldname='naming_series']
	By Series=By.xpath("//select[@data-fieldname=\"naming_series\"]");////input[@data-fieldname='attendance_date']
	By Attdate=By.xpath("//input[@data-fieldname='attendance_date']");//input[@data-fieldname='employee']
	By employe=By.xpath("//input[@data-fieldname='employee']");////div[contains(text(),'Systenics Solutions')]
	By Company=By.xpath("//div[@class='row form-section card-section visible-section']");////h3[contains(text(),'New Attendance')]
	By Tital=By.xpath("//h3[contains(text(),'New Attendance')]");
	
	
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getExport()
	{
		return driver.findElement(Export);
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}

	public WebElement getoffice()
	{
		return driver.findElement(office);
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}

	public WebElement getnext()
	{
		return driver.findElement(next);
	}
	
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getsigin1()
	{
		return driver.findElement(sigin);
	}
	
	public WebElement getstayin()
	{
		return driver.findElement(stayin);
	}
	
	public WebElement getaddattendance()
	{
		return driver.findElement(addattendance);
	}
	
	public WebElement getSeries()
	{
		return driver.findElement(Series);
	}
	
	public WebElement getAtendate()
	{
		return driver.findElement(Attdate);
	}
	
	public WebElement getEmpoye()
	{
		return driver.findElement(employe);
	}
	
	public WebElement getCompany()
	{
		return driver.findElement(Company);
	}
	

	public WebElement getTital()
	{
		return driver.findElement(Tital);
		
	}
	
}
	