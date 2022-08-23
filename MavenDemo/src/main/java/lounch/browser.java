package lounch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args){
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();//webdriver object
//lounch url by using get method
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


driver.manage().window().maximize();//maximize wab page

driver.manage().timeouts().implicitlyWait(18,TimeUnit.SECONDS);
//WebElement searchbox=driver.findElement(By.id("search_query_top"));
//searchbox.sendKeys("T-Shirts");


//driver.findElement(By.name("submit_search")).click();

//linlText,partial linkTest
//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
//driver.findElement(By.partialLinkText("Chiffon Dress")).click();


//how to used class name as locator
//int sliders=driver.findElements(By.className("homeslider-container")).size();
//System.out.println(sliders);


//used tag name as locator

//int links=driver.findElements(By.tagName("a")).size();
//System.out.println(links);


//tag & id
//driver.findElement(By.cssSelector("input#username")).sendKeys("pavanoltraining");
//driver.findElement(By.cssSelector("input#password")).sendKeys("Test@selenium123");

//tag & class
//driver.findElement(By.cssSelector("input.woocommerce-Input[name=username]")).sendKeys("pavanoltraining");
//driver.findElement(By.cssSelector("input.woocommerce-Input[name=password]")).sendKeys("Test@selenium123");

//contains
//driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-Shirt");
//driver.findElement(By.xpath("//button[contains(@name,'submit')]")).click;
//driver.findElement(By.xpath("//a[text()='Women']")).click();
//driver.findElement(By.xpath("//a[text()='T-shirts']")).click();



driver.close();
	}
}
