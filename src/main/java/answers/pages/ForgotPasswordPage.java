package answers.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ForgotPasswordPage extends AbstractPage {

	@FindBy(css = "#email")
	private WebElement emailField;

	@FindBy(xpath = "//button/span[text() = 'Retrieve Password']")
	private WebElement retrievePasswordButton;

	@FindBy(css = ".alert")
	private List<WebElement> messages;

	public ForgotPasswordPage(final WebDriver driver) {
		super(driver);
	}

	public ForgotPasswordPage requestNewPassword(final String email) {
		emailField.sendKeys(email);
		retrievePasswordButton.click();
		return this;
	}

	public List<String> getMessages() {
		return messages.stream().map(WebElement::getText).collect(Collectors.toList());
	}

}
