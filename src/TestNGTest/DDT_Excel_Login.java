package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_Excel_Login {

	 
	@Test(dataProvider = "getData")
	public void login(String email, String password) {
		WebDriver driver = utilities.DriverFactory.open();

		 driver.get("https://vishnu-qa.linksquares.dev/users/sign_in");
		 
		 driver.findElement(By.id("user_email")).sendKeys(email);
		 driver.findElement(By.id("user_password")).sendKeys(password);
		 driver.findElement(By.name("commit")).click();
		 
		 driver.close();
	}
	
	@DataProvider
	public String[][] getData(){
		return utilities.Excel.get("C:\\My Files\\Java Workspace\\SeleniumTraining\\src\\Files\\Users.xls");
	}
	
}
