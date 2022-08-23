package lounch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
/*
WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

Select dropdown = new Select(staticDropdown);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText())
*/

driver.findElement(By.id("divpaxinfo")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
Thread.sleep(2000L);

/*int i=1;
while(i<5)
{
driver.findElement(By.id("hrefIncAdt")).click();
i++;
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
*/

for(int i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();	
}

Thread.sleep(2000L);
driver.findElement(By.id("btnclosepaxoption")).click();
Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	
/*

//Dymamic dropdown

//driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();

//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@Value='BLR']")).click();
//Thread.sleep(2000L);
//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@Value='MAA']")).click();
*/

/*driver.findElement(By.id("autosuggest")).sendKeys("ind");	
Thread.sleep(3000L);
List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));	


    for(WebElement option :options)
    {
if(option.getText().equalsIgnoreCase("India"))
{
	option.click();
	break;
	
}*/
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).click();

Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscoun']")).isSelected());
driver.findElements(By.cssSelector("input[type='checkbox']")).size();
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
driver.close();


	}

	}


	

