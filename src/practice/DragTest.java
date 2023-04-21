package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// driver.manage().window().getSize();    // To get the default position of the point
		
		Point p = new Point(150,400);
		driver.manage().window().setPosition(p); // manage the browser in x-axis and y-axis according to point given
		
		// driver.manage().window().fullscreen();       To get the full screen
		// driver.manage().deleteAllCookies();         To delete all cookies
		// driver.manage().window().maximize();        To maximise the browser
		// Dimension d = new Dimension(600,300);
		// driver.manage().window().setSize(d);           To resize the browser
		
		
		driver.close();
		
		// pull
}
}
