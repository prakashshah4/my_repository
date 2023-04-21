package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCountOfAllTheLinksInAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		int count = element.size();
		System.out.println(count);
		driver.close();
		driver.get("https://www.amazon.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//a | //img"));
		int count1 = ele.size();
		System.out.println(count1);
	}
}
