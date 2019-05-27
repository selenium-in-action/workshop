package answers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

import java.time.Clock;

public abstract class AbstractPage<T extends SlowLoadableComponent<T>> extends SlowLoadableComponent<T> {

	private static final int LONG_TIMEOUT_IN_SEC = 5;
	protected WebDriver driver;

	public AbstractPage(final WebDriver driver) {
		this(driver, LONG_TIMEOUT_IN_SEC);
	}

	public AbstractPage(final WebDriver driver, final int loadTimeout) {
		super(Clock.systemDefaultZone(), loadTimeout);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
