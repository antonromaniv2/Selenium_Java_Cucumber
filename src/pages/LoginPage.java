package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user_email")
	WebElement emailField;
	
	@FindBy(id = "user_password")
	WebElement passwordField;
	
	@FindBy(name = "commit")
	WebElement loginButton;
	
	
	public void setEmail(String email) {

		emailField.sendKeys(email);
		
	}
	
	public void setPassword(String password) {

		passwordField.sendKeys(password);
		
	}
	
	public void clickLogin() {

		loginButton.click();
		
	}

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
