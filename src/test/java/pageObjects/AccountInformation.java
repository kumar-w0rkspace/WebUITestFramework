package pageObjects;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountInformation extends BasePage {

	public AccountInformation(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='login-form']/h2/b")
	WebElement msg_AccountInformation;
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement rd_Male;
	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_Password;
	@FindBy(xpath = "//select[@id='days']")
	WebElement select_Days;
	@FindBy(xpath = "//select[@id='months']")
	WebElement select_Months;
	@FindBy(xpath = "//select[@id='years']")
	WebElement select_Years;
	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement chkBox_NewsLetter;
	@FindBy(xpath = "//input[@id='optin']")
	WebElement chkBox_OptIn;
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement txt_FirstName;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement txt_LastName;
	@FindBy(xpath = "//input[@id='company']")
	WebElement txt_Company;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement txt_AddressOne;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement txt_AddressTwo;
	@FindBy(xpath = "//select[@id='country']")
	WebElement select_Country;
	@FindBy(xpath = "//input[@id='state']")
	WebElement txt_State;
	@FindBy(xpath = "//input[@id='city']")
	WebElement txt_City;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement txt_Zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement txt_PhNo;
	@FindBy(xpath = "//div[@class='login-form']//button[@type = 'submit']")
	WebElement btn_Continue;

	public String get_AccInfoMsg() {
		try {
			return msg_AccountInformation.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public void set_Gender() {
		rd_Male.click();
	}

	public void set_Password(String password) {
		txt_Password.sendKeys(password);

	}

	public void set_Date() {
		Select myDaySelect = new Select(select_Days);
		Random random = new Random();
		/*
		 * int optionCount = myDaySelect.getOptions().size()-1; int randomIndex = 1 +
		 * random.nextInt(optionCount); myDaySelect.selectByIndex(randomIndex);
		 */
		myDaySelect.selectByIndex(1 + random.nextInt(myDaySelect.getOptions().size() - 1)); // avoiding the 0 index
	}

	public void set_Month() {
		Select myMonthSelect = new Select(select_Months);
		Random random = new Random();
		myMonthSelect.selectByIndex(1 + random.nextInt(myMonthSelect.getOptions().size() - 1));
	}

	public void set_Year() {
		Select myYearSelect = new Select(select_Years);
		Random random = new Random();
		myYearSelect.selectByIndex(1 + random.nextInt(myYearSelect.getOptions().size() - 1));
	}

	public void click_NewsLetter_chkBox() {
		if (!chkBox_NewsLetter.isSelected()) {
			chkBox_NewsLetter.click();
		}
	}

	public void click_OptIn_chkBox() {
		if (!chkBox_OptIn.isSelected()) {
			chkBox_OptIn.click();
		}
	}

	public void set_FirstName(String firstName) {
		txt_FirstName.sendKeys(firstName);
	}

	public void set_LastName(String lastName) {
		txt_LastName.sendKeys(lastName);
	}

	public void set_CompanyName(String companyName) {
		txt_Company.sendKeys(companyName);
	}

	public void set_AddressOne(String address1) {
		txt_AddressOne.sendKeys(address1);
	}

	public void set_AddressTwo(String address2) {
		txt_AddressTwo.sendKeys(address2);
	}

	public void set_Country() {
		Select myCountrySelect = new Select(select_Country);
		Random random = new Random();
		myCountrySelect.selectByIndex(random.nextInt(myCountrySelect.getOptions().size()));
	}

	public void set_State(String state) {
		txt_State.sendKeys(state);
	}

	public void set_City(String city) {
		txt_City.sendKeys(city);
	}

	public void set_ZipCode(String zip) {
		txt_Zipcode.sendKeys(zip);
	}

	public void set_PhNo(String phNo) {
		txt_PhNo.sendKeys(phNo);
	}

	public void click_Continue() {
		btn_Continue.click();
	}

	public void scroll_Slider() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", select_Country);
	}
}
