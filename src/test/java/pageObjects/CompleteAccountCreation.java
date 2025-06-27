package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteAccountCreation extends BasePage {

	public CompleteAccountCreation(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[@class='title text-center']/b")
	WebElement msg_Confirmation;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btn_Continue;

	public String getCreationConfirmMsg() {

		try {
			return msg_Confirmation.getText();
		} catch (Exception e) {

			return e.getMessage();
		}
	}

	public void click_Continue() {
		btn_Continue.click();
	}

}
