package Lamadatest1; //<your package name>

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestClass1 implements Runnable {
public void run() {
    Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
    capsHashtable.put("browserName", "Chrome");
    capsHashtable.put("version", "92.0");
    capsHashtable.put("platform", "Windows 10");
    capsHashtable.put("resolution", "1024x768");
    capsHashtable.put("build", "Checking-lambdatest-build-1");
    capsHashtable.put("name", "Test 1");
    Lambdatest r1 = new Lambdatest();
    r1.executeTest(capsHashtable);
}
}
class TestClass2 implements Runnable {
  public void run() {
      Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
      capsHashtable.put("browserName", "Firefox");
      capsHashtable.put("version", "102.0");
      capsHashtable.put("platform", "Windows 10");
      capsHashtable.put("resolution", "1024x768");
      capsHashtable.put("build", "Checking-lambdatest-build-1");
      capsHashtable.put("name", "Test 2");
      Lambdatest r2 = new Lambdatest();
      r2.executeTest(capsHashtable);
  }
}
public class Lambdatest {
  public static final String USERNAME = "bmali6060";
  public static final String AUTOMATE_KEY = "46L7DCiKefSo6QnYEnjLbM9k6L5QMFjx6oV14PloMv45HxGwMK";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.lambdatest.com/wd/hub";
  public static void main(String[] args) throws Exception {
    Thread object1 = new Thread(new TestClass1());
    object1.start();
    Thread object2 = new Thread(new TestClass2());
    object2.start();
    //Thread object3 = new Thread(new TestClass3());
    //object3.start();
  }
  public void executeTest(Hashtable < String, String > capsHashtable) {
    String key;
    DesiredCapabilities caps = new DesiredCapabilities();
    // Iterate over the hashtable and set the capabilities
    Set < String > keys = capsHashtable.keySet();
    Iterator < String > itr = keys.iterator();
    while (itr.hasNext()) {
      key = itr.next();
      caps.setCapability(key, capsHashtable.get(key));
    }
    WebDriver driver;
    try {
      driver = new RemoteWebDriver(new URL(URL), caps);
      driver.get("https://lambdatest.github.io/sample-todo-app/");
      driver.findElement(By.name("li1")).click();
      driver.findElement(By.name("li2")).click();
      driver.findElement(By.id("sampletodotext")).clear();
      driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
      driver.findElement(By.id("addbutton")).click();
      driver.quit();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}