package answers.exercise5.pages;

import answers.exercise5.components.SearchComponent;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    private SearchComponent searchComponent;

    public HomePage(final WebDriver driver) {
        super(driver);
        this.searchComponent = new SearchComponent(driver);
    }

    public HomePage open() {
        driver.get("https://practicesoftwaretesting.com");
        return this;
    }

    public SearchComponent searchComponent() {
        return searchComponent;
    }
}
