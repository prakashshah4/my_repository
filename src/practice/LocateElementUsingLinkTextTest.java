package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementUsingLinkTextTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Demo1.html");
		driver.findElement(By.linkText("AMAZON")).click();
		
		// can use partial link test
		// driver.findElement(By.partialLinkText("AMAZ")).click();
		
		driver.close();
	}
}
