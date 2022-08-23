import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dffgfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\BhagyashriMali\\Desktop\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://onebeta.systenics.com/app/attendance/new-attendance-1");
				driver.manage().window().maximize();

	}

}
