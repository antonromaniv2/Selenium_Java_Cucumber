package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = utilities.DriverFactory.open();
		driver.get("https://vishnu-main.linksquares.dev/users/sign_in"); 
	}
	
	@Test(dataProvider = "getData")
	public void Login(String email, String password) {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmail(email);
		loginPage.setPassword(password);
		loginPage.clickLogin();
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]")).getText();
		
		Assert.assertTrue(text.contains("Welcome to Vishnu"));
	}
	
	@AfterMethod
	public void afterMethod() {
		
		driver.close();
		
	}

	@DataProvider
	public String[][] getData(){
		return utilities.Excel.get("C:\\My Files\\Java Workspace\\SeleniumTraining\\src\\Files\\Users.xls");
	}
	
}
