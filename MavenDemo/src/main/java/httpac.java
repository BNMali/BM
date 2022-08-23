import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httpac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();//Chromeoption help you to set behiver of our chrome option
		
		option.setAcceptInsecureCerts(true);//by using ref veriable we can acces the methodv present in chrome option of the class
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);//pass as an arrgument( have any clue)
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
