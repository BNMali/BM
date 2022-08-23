import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".blinkingText")).click();
		//window handling
	    Set<String> window = driver.getWindowHandles();//PARENT & CHILD
	    Iterator<String> it =window.iterator();//go execut the value present
	    String parentId =it.next();
	  //split the text befor AT and after at for used split method
	    String childId =it.next();
	    driver.switchTo().window(childId);
	    System.out.println(driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText());
	    driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText();
	    
	     String EmailTd=driver.findElement(By.xpath("//p[text()='Please email us at ']")).getText().split("at")[1].trim().split(" ")[0];
	     driver.switchTo().window(parentId);//scop are convarted form parent to child
	     driver.findElement(By.id("username")).sendKeys(EmailTd);
	    
	    
	     
		
	}

}
