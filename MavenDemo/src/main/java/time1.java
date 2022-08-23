import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class time1 {

	@Test
	public void m3() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

//dropdown
WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

Select dropdown = new Select(staticDropdown);
dropdown.selectByIndex(3);
Thread.sleep(3000L);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("AED");
//System.out.println(dropdown.getFirstSelectedOption().getText());
//dropdown.selectByValue("INR");
//System.out.println(dropdown.getFirstSelectedOption().getText());
//driver.close();
	}


	@BeforeMethod
		public void testouh() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
			System.out.println("befmeth");
			
	}
		
	
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();

		driver.findElement(By.id("autocomplete")).sendKeys("can");//locat and half word print
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));//
		for (WebElement select : options) {
			if (select.getText().equalsIgnoreCase("Canada")) {
				select.click();
				break;
			}
		}
		System.out.println("Canada");

	}

}


