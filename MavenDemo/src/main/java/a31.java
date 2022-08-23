
import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class a31 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.id("product"));

		System.out.println(table.findElements(By.tagName("tr")).size());// row

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());// column

//List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		List<WebElement> values = driver.findElements(By.xpath("//table[@class =\"table-display\"]/tbody/tr/td[3]"));

		int sum = 0;
		for (int i = 0; i < values.size(); i++) { // System.out.println(Integer.parseInt(values.get(i).getText()));
													// //HOW TO CONVERT STRING TO INTEGER
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);

	}

}
