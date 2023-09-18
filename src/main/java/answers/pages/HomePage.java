package answers.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

	@FindBy(css = "a.login")
	private WebElement loginLink;

	// WebElement loginLink = driver.findElement(By.cssSelector("a.login"))


	@FindBy(css = "#contact-link > a")
	private WebElement contactLink;

	@FindBy(css = "input#search_query_top")
	private WebElement searchTextfield;

	@FindBy(css = "button[name='submit_search']")
	private WebElement searchButton;

	public HomePage(final WebDriver driver) {
		super(driver);
	}

	public HomePage open() {
		driver.get("https://practicesoftwaretesting.com");
		return this;
	}

	public AuthenticationPage clickOnLogin() {
		loginLink.click();
		return new AuthenticationPage(driver);
	}

	public ContactPage navigateToContactPage() {
		contactLink.click();
		return new ContactPage(driver);
	}

	/**
	 * Zoekmethode
	 *
	 * @param query
	 * @return
	 */
	public SearchResultsPage searchFor(final String query) {
		searchTextfield.sendKeys(query);
		searchButton.click();
		return new SearchResultsPage(driver);
	}

}
