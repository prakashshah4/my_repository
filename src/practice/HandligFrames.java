package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandligFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/mainpage.html"); // control is in main page
		driver.switchTo().frame(0); // switching control from main page to frame
		WebElement ele = driver.findElement(By.id("t2"));
		ele.sendKeys("Shah");
		driver.switchTo().defaultContent();
		// driver.switchTo().parentFrame();  or can use to go back to main frame
		driver.findElement(By.id("t1")).sendKeys("Parkash");
		
}
}