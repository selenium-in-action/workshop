package exercises.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {

	private static Logger log = LogManager.getLogger(answers.pages.MyAccountPage.class);

	@FindBy(css = "a.login")
	private WebElement loginLink;

	@FindBy(css = "div#center_column > p")
	private WebElement welcomeMessage;

	public MyAccountPage(final WebDriver driver) {
		super(driver);
	}

	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}

}
