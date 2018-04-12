package browser.structured.answers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.listeners.TestListener;
import utils.webdriver.BrowserProvider;

import java.net.MalformedURLException;

@Listeners({TestListener.class})
public abstract class AbstractTestBase {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        driver = BrowserProvider.createDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}