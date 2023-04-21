package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// count of links
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		int count = element.size();
		System.out.println(count);
		for (WebElement link : element) {
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();
}
}