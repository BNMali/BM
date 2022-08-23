import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwate {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id=\"start\"]/button[text()=\"Start\"]")).click();
		//Wait<WebDriver>wait=new fluentwate()<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				//.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.id("finish")).isDisplayed())
						{
				return driver.findElement(By.id("finish"));
			}
				else
					return null;
			}
				});
		System.out.println(driver.findElement(By.id("finish")).isDisplayed());
		System.out.println(driver.findElement(By.id("finish")).getText());
		
	}
	

				}
	


