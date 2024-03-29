package browser.lineair.exercises.fix.broken.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractTestBase {
    protected WebDriver driver;
    // protected RemoteWebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        // Create a new instance of the Chrome driver
        driver = new FirefoxDriver();
        // final DesiredCapabilities dr = DesiredCapabilities.chrome();
        // driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), dr);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        // Close the browser
		driver.quit();
    }

}
