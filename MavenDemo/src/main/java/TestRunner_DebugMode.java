import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class TestRunner_DebugMode {

	private static final File scr = null;
	private static FileUtils FileUnilt;

	public static void main(String[] args) throws IOE{

		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("debuggerAddress", "localhost:9222");



       System.setProperty("webdriver.chrome.driver", "C:/Users/BhagyashriMali/Desktop/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You will be limited to only fewer functionalities of the app. Proceed?']")));
		System.out.println(driver.findElement(By.xpath("//p[text()='You will be limited to only fewer functionalities of the app. Proceed?']")).getText());
		driver.findElement(By.id("okayBtn")).click();
 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUnilt.copyFile(scr,new File("C://screenshot.png"));    
	}

}
