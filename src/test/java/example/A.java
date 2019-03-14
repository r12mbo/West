package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	static 
	{
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";	
		System.setProperty(key, value);
	}
	static 
	{
		String key = "webdriver.gecko.driver";
		String value = "./driver/geckodriver.exe";	
		System.setProperty(key, value);
	}
	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");	
		WebElement element =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		
		a.accept();
		
		a.dismiss();
		
		

	}
}
