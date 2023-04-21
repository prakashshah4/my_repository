package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsUsingTagNameTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Htmldemo.html");
		driver.findElement(By.tagName("a")).click();
		
		/* or can do it like
		 WebElement element = driver.findElement(By.tagName("a")); 
		 element.click();
		 */
		
		driver.close();
	}
}
