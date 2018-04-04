package browser;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.listeners.TestListener;
import utils.listeners.webdriver.Browser;
import utils.listeners.webdriver.BrowserProvider;

import java.net.MalformedURLException;

@Listeners({TestListener.class})
public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setupClass() {

        FirefoxDriverManager.getInstance(DriverManagerType.CHROME).setup();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
//        DesiredCapabilities capability = DesiredCapabilities.chrome();
//        driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), capability);

//        driver = new FirefoxDriver();
            driver = BrowserProvider.createDriver(Browser.CHROME);
        driver.get("http://www.google.com");
    }

    @AfterMethod
    public void teardown() {
        //Close the browser
        driver.quit();
    }
}
