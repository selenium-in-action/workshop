package browser.structured.exercises;

import exercises.pages.HomePage;
import exercises.pages.SearchResultsPage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Test
public class DataDrivenSearchTest {

	protected WebDriver driver;
	// protected RemoteWebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		// final DesiredCapabilities dr = DesiredCapabilities.chrome();
		// driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), dr);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

	@DataProvider
	public Object[][] data() {
		return new Object[][]{ //
			{ "Dress" }, //
			{ "Sleeves" }, //
			{ "Blouse" }, //
			{ "T-shirt" } //
		};
	}

	@Test(dataProvider = "data")
	public void searchSuccess(final String query) {
		final SearchResultsPage searchResultsPage = new HomePage(driver).open() //
				.searchFor(query);

		Assertions.assertThat(searchResultsPage.getResults().size()).isGreaterThan(0);
	}
}