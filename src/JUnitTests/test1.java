package JUnitTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExplicitWaitClass;

public class test1 {

	 public static void main(String[] args) {
		 
		 WebDriver driver = utilities.DriverFactory.open();
		 
		 
		 
		 driver.get("https://vishnu-qa.linksquares.dev/users/sign_in");
		 
		 driver.findElement(By.id("user_email")).sendKeys("administrator@example.com");
		 driver.findElement(By.id("user_password")).sendKeys("password1234");
		 
		 driver.findElement(By.name("commit")).click();
		 
		 driver.findElement(By.linkText("Users")).click();
		 
		 driver.findElement(By.cssSelector("button[data-bs-target='#createUserModal'][type='button']")).click();
		 
		 
		 driver.switchTo().activeElement();

		 ExplicitWaitClass.ExplicitWait(driver, "user[first_name]");
		 driver.findElement(By.id("user[first_name]")).sendKeys("Anton Romaniv");
		 new Select(driver.findElement(By.id("user[role]"))).selectByVisibleText("Annotator");
		 
		 //driver.close();
	 }
	 
	 
}