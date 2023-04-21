package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.in/");
			// for locating element
			WebElement element = driver.findElement(By.xpath("//a[.='ਪੰਜਾਬੀ']"));
			// for getting the attribute link text
			String attribute = element.getAttribute("href");
			System.out.println(attribute);
			driver.close();
	}
}
