import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		
		
		
		//split parent to child window
		 Set<String> window=driver.getWindowHandles();
		 Iterator<String> it =window.iterator();
		 String parentID =it.next();
		String childID =it.next();
		driver.switchTo().window(childID);
		
         driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).sendKeys("Automation");
		
		//split to chils to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	}

}
