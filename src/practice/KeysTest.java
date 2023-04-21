		package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Demo3.html");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@value='World']")).clear();
		WebElement ele = driver.findElement(By.xpath("//input[@value='World']"));
		// ele.clear();    or by using key
		ele.sendKeys(Keys.CONTROL+"a");  // Select all the values
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);  // Delete the selected value 
		
}
}