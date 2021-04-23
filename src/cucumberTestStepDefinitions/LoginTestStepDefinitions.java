package cucumberTestStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTestStepDefinitions {
	
	WebDriver driver;

	@Given("^user is on the Login page$")
	public void user_is_on_the_Login_page() {
		
		driver = utilities.DriverFactory.open();
		driver.get("https://vishnu-main.linksquares.dev/users/sign_in"); 
		
	}
	
	
	@When("^user enters valid credentials and clicks Login$")
	public void user_enters_valid_credentials_and_clicks_Login() {
		
		 driver.findElement(By.id("user_email")).sendKeys("administrator@example.com");
		 driver.findElement(By.id("user_password")).sendKeys("password1234");
		 driver.findElement(By.name("commit")).click();
		
	}
	
	
	@Then("^user is navigated to Projects tab$")
	public void user_is_navigated_to_Projects_tab() {
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]")).getText();
		Assert.assertTrue(text.contains("Welcome to Vishnu"));
		//driver.close();
	}
	
	
}
