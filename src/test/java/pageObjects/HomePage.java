package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(partialLinkText = "Signup")
	WebElement link_Signup_Login;

	@FindBy(xpath = "//div[@class='single-widget']/h2")
	WebElement msg_Subscription;

	public void clickSignup() {
		link_Signup_Login.click();
	}

	public String getSubscriptionMsg() {

		try {
			return msg_Subscription.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
