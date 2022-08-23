import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.id("checkBoxOption1")).click();//Check the first
		 * Checkbox Assert.assertTrue(driver.findElement(By.xpath(
		 * "//input[@id='checkBoxOption1']")).isSelected());// verify if it is
		 * successfully Unchecked Thread.sleep(3000L);
		 * driver.findElement(By.id("checkBoxOption1")).click();//UnCheck the first
		 * Checkbox Assert.assertFalse(driver.findElement(By.xpath(
		 * "//input[@id='checkBoxOption1']")).isSelected());// verify if it is
		 * successfully Unchecked
		 * 
		 * //How to get the Count of number of check boxes present in the page
		 * driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 * System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size()); driver.close();
		 */

		// System.out.println(By.id("Div1")).getAttribulte("style")
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div")).getAttribute("style").contains("1")) {
			System.out.println("it enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
		driver.close();
	}

}
