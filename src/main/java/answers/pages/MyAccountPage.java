package answers.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage<MyAccountPage> {

	private static Logger log = LogManager.getLogger(MyAccountPage.class);

	@FindBy(css = "div#center_column > p")
	private WebElement welcomeMessage;

	public MyAccountPage(final WebDriver driver) {
		super(driver);
	}

	@Override
	protected void load() {
		log.info("Can't navigate to the resultspage directly");
	}

	@Override
	protected void isLoaded() throws Error {
		// verify if the correct page is open
		final String url = driver.getCurrentUrl();
		Assertions.assertThat(url).endsWith("?controller=my-account");
	}

	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}

}
