package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOfSendKeys {

	public static void main(String[] args) {
		// How to use sendkeys()?
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Demo2.html");
		WebElement element =  driver.findElement(By.id("rty"));
		element.sendKeys("Prakash");
		driver.close();
	}

}
