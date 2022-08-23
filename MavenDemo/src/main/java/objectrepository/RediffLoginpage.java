package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpage {
	
	
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id=\"password\"]");
	By submit=By.name("proceed");
    By home=By.linkText("rediff.com");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement submit;
	
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	

	public WebElement Emaild()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
	
	public WebElement home()
	{
		return home;
	}
}
