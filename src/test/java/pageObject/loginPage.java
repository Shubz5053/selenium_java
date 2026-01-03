package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends baseClass {

	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[normalize-space()='Login Now']")
	WebElement loginButton;

	public void inputField(String userName) {
		userNameField.sendKeys(userName);
	}

	public void passwordField(String Password) {
		passwordField.sendKeys(Password);
	}

	public void loginButtonn() {
		loginButton.click();
	}
}
