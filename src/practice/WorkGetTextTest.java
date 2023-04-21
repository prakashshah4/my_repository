package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkGetTextTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//button[@type = 'submit']"));
		//element.click();
		String text = element.getText();
		System.out.println(text);
		Point locn = element.getLocation();
		System.out.println(locn);
		int x = locn.getX();
		System.out.println(x);
		int y = locn.getY();
		System.out.println(y);
		int h = element.getSize().getHeight();
		System.out.println(h);
		int w = element.getSize().getWidth();
		System.out.println(w);
		driver.close();
	}
}
