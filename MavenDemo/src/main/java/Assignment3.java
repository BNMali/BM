import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You will be limited to only fewer functionalities of the app. Proceed?']")));
//		System.out.println(driver.findElement(By.xpath("//p[text()='You will be limited to only fewer functionalities of the app. Proceed?']")).getText());
//		driver.findElement(By.id("okayBtn")).click();
		
		//static dropdown
		WebElement staticDropdown =driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
      
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		System.out.println(dropdown.getOptions());
		
		//int j=0;
		   String[] itemneed = {"iphone","Samsung","Nokia","Blackberry"};

		driver.findElement(By.id("signInBtn")).click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		m2(driver,itemneed);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.id("country")).sendKeys("Mumbai");
		Thread.sleep(9000L);
		//w.until(ExpectedConditions.elementToBeClickable(By.id("checkbox2")));
//		WebElement uname = driver.findElement(By.id("checkbox2"));
//				uname.sendKeys(Keys.TAB);
	
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.id("checkbox2"))).click().perform();
		
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		   }
		   public static void m2(WebDriver driver,String[] itemneed) 
			{
				int j=0;
			 List<WebElement> products =driver.findElements(By.cssSelector("h4.card-title"));
			 for(int i=0;i<products.size();i++)
			 {
				 
				 
				 String[] name=products.get(i).getText().split(" ");
				 String formatter=name[0].trim();
				 
				List itemneedList = Arrays.asList(itemneed);//CONVERT ARRAY INYO ARRAY LIST
				 
				 if(itemneedList.contains(formatter))
				 {
					 j++;
					 driver.findElements(By.xpath("//button[contains(text(),'Add ')]")).get(i).click();
				 
					 if(j==itemneed.length) 
					 {
						 break;
					 }
				 }
				 
			 }
			 System.out.println(j);
			 //Thread.sleep(2000L);
			 //driver.close();
				}

			

	}


