package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchAllOptionsTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium%20Lecture/Demo6.html");
		WebElement dd = driver.findElement(By.id("BBQ"));
		Select se = new Select(dd);
		List<WebElement> options = se.getOptions();
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
		//se.selectByIndex(4);
		//se.selectByValue("m");
		// se.selectByVisibleText("MushroomBiriyani");
		if(se.isMultiple())
		{
			System.out.println("Yes the dropdown is multiple");
		}
		else
		{
			System.out.println("No it is not multiple dropdown");
		}
		driver.close();
		
}
}