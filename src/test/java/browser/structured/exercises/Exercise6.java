package browser.structured.exercises;

import exercises.pages.AuthenticationPage;
import exercises.pages.HomePage;
import exercises.pages.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * The goal of this exercise is to use an existing data object. (POJO) Use the Account object
 *
 */
@Test
public class Exercise6 {

	protected WebDriver driver;

	@BeforeSuite
	public void setupDriverManager() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

	public void loginSuccess() {
		final MyAccountPage accountPage = new HomePage(driver) //
				.get() //
				.clickOnLogin() //
				.loginWith("tester@test.com", "1qazxsw2");

		Assertions.assertThat(accountPage.getWelcomeMessage())
				.isEqualTo("Welcome to your account. Here you can manage all of your personal information and orders.");
	}

	public void loginAccountDoesNotExist() {

		final AuthenticationPage authenticationPage = new HomePage(this.driver) //
				.get() //
				.clickOnLogin();
		authenticationPage.loginWith("1234@test.com", "1qazxsw2");

		Assertions.assertThat(authenticationPage.isAlertPresent()).isEqualTo(true);
	}
}
