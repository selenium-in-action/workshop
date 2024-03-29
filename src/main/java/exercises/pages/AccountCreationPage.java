package exercises.pages;

import exercises.types.Title;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreationPage extends AbstractPage {

	@FindBy(css = "input#id_gender1")
	private WebElement maleRadio;

	@FindBy(css = "input#id_gender2")
	private WebElement femaleRadio;

	@FindBy(css = ".customer_firstname")
	private WebElement firstnameTextfield;

	@FindBy(css = "input[id *= 'customer']")
	private WebElement lastnameTextfield;

	@FindBy(css = "input#email")
	private WebElement emailTextfield;

	@FindBy(css = "input#passwd")
	private WebElement passwordTextfield;

	@FindBy(css = "select.days")
	private WebElement daysSelect;

	@FindBy(css = "select#months")
	private WebElement monthsSelect;

	@FindBy(css = "select#yars")
	private WebElement yearsSelect;

	@FindBy(css = "submit")
	private WebElement registerButton;

	public AccountCreationPage(final WebDriver driver) {
		super(driver);
	}

	public AccountCreationPage setTitle(Title mr) {
		final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(maleRadio));

		if (mr.equals(Title.MR)) {
			maleRadio.click();
		} else if (mr.equals(Title.MRS)) {
			femaleRadio.click();
		}
		return this;
	}

	public AccountCreationPage setFirstname(final String firstname) {
		firstnameTextfield.sendKeys(firstname);
		return this;
	}

	public AccountCreationPage setLastname(final String lastname) {
		lastnameTextfield.sendKeys(lastname);
		return this;
	}

	public AccountCreationPage setEmail(final String email) {
		emailTextfield.sendKeys(email);
		return this;
	}

	public AccountCreationPage setPassword(final String password) {
		passwordTextfield.sendKeys(password);
		return this;
	}

	public AccountCreationPage setDob(final String days, final String months, final String years) {
		final Select daySelect = new Select(daysSelect);
		daySelect.selectByValue(days);

		final Select monthSelect = new Select(monthsSelect);
		monthSelect.selectByValue(months);

		final Select yearSelect = new Select(yearsSelect);
		yearSelect.selectByValue(years);
		return this;
	}

	public MyAccountPage clickOnRegister() {
		registerButton.click();
		return new MyAccountPage(driver);
	}

}
