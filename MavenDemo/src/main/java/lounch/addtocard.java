package lounch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
int j=0;
   String[] itemneed = {"Brocolli","Cauliflower","Cucumber","Beetroot","Beans" };

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


 List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
 
 for(int i=0;i<products.size();i++)
 {
	 
	 //Brocolli - Kg
	 //Brocolli, - Kg
	 //split() method to take only brocolli item
	// String name=products.get(i).getText();//change for used split method
	 String[] name=products.get(i).getText().split("-");
	 String formatter=name[0].trim();//remove space
	 
	List itemneedList = Arrays.asList(itemneed);//CONVERT ARRAY INYO ARRAY LIST
	 
	 if(itemneedList.contains(formatter))
	 {
		 j++;
		 driver.findElements( By.xpath("//div[@class='product-action']/button")).get(i).click();
	 //brake; (why we not used brake becouse when we used brake we come with one item only and another item skip
		 //but when we not used brake how over come the 30 time work
	
		 if(j==itemneed.length) 
		 {
			 break;
		 }
	 }
	 
 }
 Thread.sleep(2000L);
 driver.close();
	}

}
