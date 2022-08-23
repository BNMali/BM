import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
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


