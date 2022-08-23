import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
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
//System.out.println(selectByIndex);
	}

}
