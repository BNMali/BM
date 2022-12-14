import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fraim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		//driver.switchTo().frame(1)
		//when we want to find the how many tag are present on dom
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        //driver.findElement(By.id("draggable")).click();
        Actions a =new Actions(driver);
        WebElement source =driver.findElement(By.id("draggable"));
        WebElement target =driver.findElement(By.id("droppable"));
        
        a.dragAndDrop(source, target).build().perform();//drag and drop
        
        //when we want to locat the another elemant present out of the fraim use defaultContent
        driver.switchTo().defaultContent();// comes ba to normal window
        
        
	}

}
