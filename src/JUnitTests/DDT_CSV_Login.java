package JUnitTests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(value = Parameterized.class)
public class DDT_CSV_Login {
	
	String email;
	String password;

	@Test
	public void Login() {
		 WebDriver driver = utilities.DriverFactory.open();

		 driver.get("https://vishnu-main.linksquares.dev/users/sign_in");
		 
		 driver.findElement(By.id("user_email")).sendKeys(email);
		 driver.findElement(By.id("user_password")).sendKeys(password);
		 driver.findElement(By.name("commit")).click();
		 
		 driver.close();
	} 
	
	@Parameters
	public static List<String[]> getData(){
		return utilities.CSV.get("C:\\My Files\\Java Workspace\\SeleniumTraining\\src\\Files\\Users.csv");
	}
	
	public DDT_CSV_Login(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
}
