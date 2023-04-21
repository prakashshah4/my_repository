package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEmptyFirefoxBrowser {
	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./Drivers/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.close();
	}
}
