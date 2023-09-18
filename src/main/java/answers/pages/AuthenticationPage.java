package answers.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends AbstractPage {

	@FindBy(css = "input#email")
	private WebElement emailTextfield;

	@FindBy(css = "input#passwd")
	private WebElement passwordTextfield;

	@FindBy(css = "input#email_create")
	private WebElement emailCreatTextfield;

	@FindBy(css = "button#SubmitLogin")
	private WebElement loginButton;

	@FindBy(css = "button#SubmitCreate")
	private WebElement createNewButton;

	@FindBy(css = ".lost_password a")
	private WebElement forgotPasswordLink;

	@FindBy(css = ".alert-danger")
	private WebElement alert;

	public AuthenticationPage(final WebDriver driver) {
		super(driver);
	}

	public MyAccountPage loginWith
			(final String email, final String password) {
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		loginButton.click();
		return new MyAccountPage(driver);
	}

	public boolean isAlertPresent() {
		return alert.isDisplayed();
	}

	public AccountCreationPage createNewAccount(final String email) {
		emailCreatTextfield.sendKeys(email);
		createNewButton.click();
		return new AccountCreationPage(driver);
	}

	public ForgotPasswordPage clickOnForgotPassword() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage(driver);
	}

}
