package exercises.pages;

import answers.types.SearchResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends AbstractPage {

    private static Logger log = LogManager.getLogger(SearchResultsPage.class);

    @FindBy(css = "ul.product_list a.product-name")
    private List<WebElement> productNames;

    @FindBy(xpath = "//ul[contains(@class,'product_list')]/li")
    private List<WebElement> productList;

    public SearchResultsPage(final WebDriver driver) {
        super(driver);
    }

    public List<String> getProductNames() {
        return productNames.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public List<SearchResult> getResults() {
        return productList.stream().map(SearchResult::new).collect(Collectors.toList());
    }

}
