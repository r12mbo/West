package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.get("file:///C:/Users/akshay/Desktop/Demo.html");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements);
		

	}
}
