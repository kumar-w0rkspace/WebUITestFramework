package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnHome extends BasePage {

	public ReturnHome(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li[10]")
	WebElement info_UserName;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li[5]/a")
	WebElement btn_Delete;

	public String verify_LoggedIn_Name() {
		try {
			return info_UserName.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public void click_Delete() {
		btn_Delete.click();
	}

}
