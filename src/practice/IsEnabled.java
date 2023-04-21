package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Demo3.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value=\"Hello\"]"));
		if(ele.isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		driver.close();

	}

}
