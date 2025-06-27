package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccount extends BasePage {

	public DeleteAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement msg_Acc_Deleted;
	@FindBy(xpath = "//div[@class='pull-right']/a")
	WebElement btn_Continue;

	public String verify_DeleteMsg() {
		try {
			return msg_Acc_Deleted.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public void click_Continue() {
		btn_Continue.click();
	}

}
