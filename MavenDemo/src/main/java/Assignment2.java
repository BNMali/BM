import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Bhaguashri");
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("bmali6060@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys("Pass@123");
		
		driver.findElement( By.xpath("//input[@id=\"exampleCheck1\"]")).click();

	WebElement staticDropdown =	driver.findElement(By.id("exampleFormControlSelect1"));
	
Select dropdown = new Select(staticDropdown);
Thread.sleep(2000L);
dropdown.selectByIndex(1);
dropdown.getAllSelectedOptions().listIterator();
Thread.sleep(2000L);
driver.findElement( By.xpath("//input[@id=\"inlineRadio1\"]")).click();
Thread.sleep(2000L);
driver.findElement( By.xpath("//input[@name=\"bday\"]")).sendKeys("01/01/1998");
Thread.sleep(2000L);
driver.findElement( By.xpath("//input[@value=\"Submit\"]")).click();
System.out.println(driver.findElement( By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
driver.close();
}
}