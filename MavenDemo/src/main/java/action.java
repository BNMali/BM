import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		String move=driver.findElement(By.xpath("//span[text()='Account & Lists']")).getText();
	
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().doubleClick().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//Move to specific element
		a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(3000L);
		//driver.close();
	}

}


