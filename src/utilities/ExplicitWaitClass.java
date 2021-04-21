package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {
	
	public static void ExplicitWait(WebDriver driver, String id) {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 3);
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		 
	 }
}
