package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountInformation;
import pageObjects.CompleteAccountCreation;
import pageObjects.DeleteAccount;
import pageObjects.HomePage;
import pageObjects.ReturnHome;
import pageObjects.RegisterUser;
import testBase.BaseClass;

public class TC001_Register_User extends BaseClass { // need to do logging

	HomePage hp;
	RegisterUser regUser;
	AccountInformation accInfo;
	CompleteAccountCreation ac;
	ReturnHome rt;
	DeleteAccount delAcc;
	String userName = randomNameString(7);

	@Test(priority = 1)
	public void verify_Subscription_Msg() {
		hp = new HomePage(driver);
		Assert.assertEquals(hp.getSubscriptionMsg(), "SUBSCRIPTION");
	}

	@Test(priority = 2)
	public void clickOn_Signup() {
		hp = new HomePage(driver);
		hp.clickSignup();
	}

	@Test(priority = 3, dependsOnMethods = { "clickOn_Signup" })
	public void verify_NewUser_Msg() {
		regUser = new RegisterUser(driver);
		String userSignUpMsg = regUser.getUserSignUpMsg();
		Assert.assertEquals(userSignUpMsg, "New User Signup!");
	}

	@Test(priority = 4, dependsOnMethods = { "clickOn_Signup" })
	public void set_UserDetails() {
		regUser = new RegisterUser(driver);
		regUser.setUserName(userName);
		regUser.setEmail(randomNameString(4).concat("@yowmail.com"));
		regUser.clickSignup();
	}

	@Test(priority = 5, dependsOnMethods = { "set_UserDetails" })
	public void verify_AccountDetails() {
		accInfo = new AccountInformation(driver);
		Assert.assertEquals(accInfo.get_AccInfoMsg(), "ENTER ACCOUNT INFORMATION");
	}

	@Test(priority = 6, dependsOnMethods = { "set_UserDetails" })
	public void set_AccountDetails() {
		accInfo = new AccountInformation(driver);
		accInfo.set_Gender();
		accInfo.set_Password(randomNameString(4));
		accInfo.set_Date();
		accInfo.set_Month();
		accInfo.set_Year();
		accInfo.click_NewsLetter_chkBox();
		accInfo.click_OptIn_chkBox();
		accInfo.set_FirstName(randomNameString(5));
		accInfo.set_LastName(randomNameString(3));
		accInfo.set_CompanyName(randomNameString(4).toUpperCase());
		accInfo.set_AddressOne(randomNameString(7));
		accInfo.set_AddressTwo(randomNameString(4));
		accInfo.scroll_Slider();
		accInfo.set_Country();
		accInfo.set_State(randomNameString(12));
		accInfo.set_City(randomNameString(15));
		accInfo.set_ZipCode(randomNumber(5));
		accInfo.set_PhNo(randomNumber(10));
		accInfo.click_Continue();
	}

	@Test(priority = 7, dependsOnMethods = { "set_AccountDetails" })
	public void verify_AccountCreation() {
		ac = new CompleteAccountCreation(driver);
		Assert.assertEquals(ac.getCreationConfirmMsg(), "ACCOUNT CREATED!");
	}

	@Test(priority = 8, dependsOnMethods = { "verify_AccountCreation" })
	public void click_ContinueBtn() {
		ac.click_Continue();
	}

	@Test(priority = 9, dependsOnMethods = { "click_ContinueBtn" })
	public void verify_UserName_Visibility() {
		rt = new ReturnHome(driver);
		Assert.assertEquals(rt.verify_LoggedIn_Name(), "Logged in as " + userName);
		rt.click_Delete();
	}

	@Test(priority = 10, dependsOnMethods = { "click_ContinueBtn" })
	public void verify_Account_Deletion() {
		delAcc = new DeleteAccount(driver);
		Assert.assertEquals(delAcc.verify_DeleteMsg(), "ACCOUNT DELETED!");
	}

	@Test(priority = 11, dependsOnMethods = { "verify_Account_Deletion" })
	public void back_Home() {
		delAcc.click_Continue();
	}
}
