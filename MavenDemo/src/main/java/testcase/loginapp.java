package testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class loginapp {
//private static final long TimeOut = 0;

//Login page class implemented in normal page object pattern style
	
	//Home page class impolemented in page object factory methods
	
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hellow1");
		rd.submit().click();
	    rd.home().click();
	    RediffHomepage rh1=new RediffHomepage(driver);
	    
	    rh1.Search().sendKeys("CCTV Camera");
	    rh1.SubmitN1().click();
        
}
}
