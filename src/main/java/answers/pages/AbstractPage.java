package answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

import java.time.Clock;

public abstract class AbstractPage {

	protected WebDriver driver;

	public AbstractPage(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
