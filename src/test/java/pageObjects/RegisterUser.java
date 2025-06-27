package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUser extends BasePage {

	public RegisterUser(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='signup-form']/h2")
	WebElement msg_NewUser;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txt_Name;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txt_email;
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	WebElement btn_Signup;

	public void setUserName(String name) {
		txt_Name.sendKeys(name);
	}

	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}

	public void clickSignup() {
		btn_Signup.click();
	}

	public String getUserSignUpMsg() {

		try {
			return msg_NewUser.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
