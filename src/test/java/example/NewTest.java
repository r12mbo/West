package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	static 
	{
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";	
		System.setProperty(key, value);
	}
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  @BeforeMethod
  public void beforeMethod() {
	 driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();;
  }
   
}
