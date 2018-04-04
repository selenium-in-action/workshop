package browser;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void searchOnGoogle() throws InterruptedException {
        Thread.sleep(5000);

        // Find the text input element by its name
        WebElement element = getDriver().findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Che______ese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + getDriver().getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(getDriver(), 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + getDriver().getTitle());

//        Assert.assertTrue(false);
    }
}
