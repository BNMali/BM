import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.cssSelector(".table-display[id =\"product\"]"));
		int rowcount= table.findElements(By.xpath("//table[@ class =\"table-display\"]/child::tbody/tr[2]")).size();
		
		int count=table.findElements(By.cssSelector(".left-align td:nth-child(3) ")).size();
		
		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//103
		}
		//System.out.println(sum);

		
	}

}
