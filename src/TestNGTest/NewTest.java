package TestNGTest;

import org.testng.annotations.Test;

import utilities.ExplicitWaitClass;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	 WebDriver driver;
	 
	 @Test
	 public void createUser() {
		 
		 driver.findElement(By.id("user_email")).sendKeys("administrator@example.com");
		 driver.findElement(By.id("user_password")).sendKeys("password1234");
		 
		 driver.findElement(By.name("commit")).click();
		 
		 String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]")).getText();
		 
		 driver.findElement(By.linkText("Users")).click();
		 
		 driver.findElement(By.cssSelector("button[data-bs-target='#createUserModal'][type='button']")).click();
		 
		 
		 driver.switchTo().activeElement();

		 ExplicitWaitClass.ExplicitWait(driver, "user[first_name]");
		 driver.findElement(By.id("user[first_name]")).sendKeys("Anton Romaniv");
		 new Select(driver.findElement(By.id("user[role]"))).selectByVisibleText("Annotator");
		 
	 }
	 
	 @BeforeMethod
	 public void beforeMethod() {
		 
		 driver = utilities.DriverFactory.open();
		 driver.get("https://vishnu-qa.linksquares.dev/users/sign_in");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
		 
	 }
	

}
