package testBase;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Logger log;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String browser) {

		log = LogManager.getLogger(this.getClass());

		FirefoxProfile profile = new FirefoxProfile();
		profile.addExtension(new File(System.getProperty("user.dir") + "\\uBlock.xpi"));
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);

		driver = new FirefoxDriver(options);

		switch (browser.toLowerCase()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser name");
			return;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	public String randomNameString(int size) {

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random randomString = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(alphabet.charAt(randomString.nextInt(alphabet.length())));
		}

		return sb.toString();
	}

	public String randomNumber(int size) {
		String numbers = "1234567890";
		Random randomNumber = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(numbers.charAt(randomNumber.nextInt(numbers.length())));
		}

		return sb.toString();
	}

	public void selectRandomValue(WebElement dropDown) {
		Select myDOBSelect = new Select(dropDown);
		int size = myDOBSelect.getOptions().size();
		if (size > 1) {
			Random random = new Random();
			myDOBSelect.selectByIndex(1 + random.nextInt(size - 1));
		}
	}

}
