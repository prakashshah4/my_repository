package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEmptyChromeBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();	
}
}