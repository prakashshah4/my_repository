package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1AC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		// To perform double click on any web element
		// act.doubleClick(ele);
		// To perform right click on anyy web element
		// act.contextClick(ele);
		// To handle drag and drop
		// act.dragAndDrop(ele, ele).perform();     (source ele, target ele)
}
}