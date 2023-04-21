package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingUsingNavigate {

	public static void main(String[] args) throws InterruptedException {
		// How to use sendkeys()?
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///F:/Selenium%20Lecture/Demo2.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

}









