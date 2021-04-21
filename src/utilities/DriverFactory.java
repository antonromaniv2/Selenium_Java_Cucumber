package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	//Define the WebDriver
	public static WebDriver open() {
		System.setProperty("webdriver.chrome.driver", "C:\\My Files\\Jars\\chromedriver.exe");
		return new ChromeDriver();
	}
	
}
