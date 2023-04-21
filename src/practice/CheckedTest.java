package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckedTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Htmldemo.html");
		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean a = element.isSelected(); // it tells wheather is selected or not like checkbox
		System.out.println(a);
		System.out.println(element.isDisplayed()); // it tells you wheather is visible or not
		driver.close();
}
}