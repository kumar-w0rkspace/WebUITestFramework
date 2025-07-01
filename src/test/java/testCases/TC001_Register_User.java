package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountInformation;
import pageObjects.CompleteAccountCreation;
import pageObjects.DeleteAccount;
import pageObjects.HomePage;
import pageObjects.RegisterUser;
import pageObjects.ReturnHome;
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
		log.info("**** Veryfing Home Page Visibility ****");
		hp = new HomePage(driver);
		try {
			if (hp.getSubscriptionMsg().equals("SUBSCRIPTION")) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current value: " + hp.getSubscriptionMsg() + "-");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 2)
	public void clickOn_Signup() {
		log.info("**** Clicking on SignUp ****");
		hp = new HomePage(driver);
		hp.clickSignup();
	}

	@Test(priority = 3, dependsOnMethods = { "clickOn_Signup" })
	public void verify_NewUser_Msg() {
		log.info("**** Verifying New User SignUp! message ****");
		regUser = new RegisterUser(driver);
		String userSignUpMsg = regUser.getUserSignUpMsg();
		try {
			if (userSignUpMsg.equals("New User Signup!")) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current Value: " + regUser.getUserSignUpMsg() + "-");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 4, dependsOnMethods = { "clickOn_Signup" })
	public void set_UserDetails() {
		log.info("**** Signing up new user ****");
		regUser = new RegisterUser(driver);
		regUser.setUserName(userName);
		regUser.setEmail(randomNameString(4).concat("@yowmail.com"));
		regUser.clickSignup();
	}

	@Test(priority = 5, dependsOnMethods = { "set_UserDetails" })
	public void verify_AccountDetails() {
		log.info("**** Veryfing ENTER ACCOUNT INFORMATION visibility ****");
		accInfo = new AccountInformation(driver);
		try {
			if (accInfo.get_AccInfoMsg().equals("ENTER ACCOUNT INFORMATION")) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current Value: " + accInfo.get_AccInfoMsg() + "-");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 6, dependsOnMethods = { "set_UserDetails" })
	public void set_AccountDetails() {
		log.info("**** Providing User Details ****");
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
		log.info("**** Veryfing ACCOUNT CREATED! message ****");
		ac = new CompleteAccountCreation(driver);
		try {
			if (ac.getCreationConfirmMsg().equals("ACCOUNT CREATED!")) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current Value: " + ac.getCreationConfirmMsg() + "-");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 8, dependsOnMethods = { "verify_AccountCreation" })
	public void click_ContinueBtn() {
		ac.click_Continue();
	}

	@Test(priority = 9, dependsOnMethods = { "click_ContinueBtn" })
	public void verify_UserName_Visibility() {
		log.info("**** Veryfing Logged in as _User Name_ message ****");
		rt = new ReturnHome(driver);
		try {
			if (rt.verify_LoggedIn_Name().equals("Logged in as " + userName)) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current Value: " + rt.verify_LoggedIn_Name() + "-");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.fail();
		}
		rt.click_Delete();
	}

	@Test(priority = 10, dependsOnMethods = { "click_ContinueBtn" })
	public void verify_Account_Deletion() {
		log.info("*** Veryfing ACCOUNT DELETED! message ****");
		delAcc = new DeleteAccount(driver);
		try {
			if (delAcc.verify_DeleteMsg().equals("ACCOUNT DELETED!")) {
				Assert.assertTrue(true);
			} else {
				log.error("-Test Failed-");
				log.debug("-Current Value: " + delAcc.verify_DeleteMsg() + "-");
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 11, dependsOnMethods = { "verify_Account_Deletion" })
	public void back_Home() {
		log.info("**** Clicking continue button ****");
		delAcc.click_Continue();
	}
}
