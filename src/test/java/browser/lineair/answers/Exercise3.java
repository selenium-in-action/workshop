package browser.lineair.answers;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * The goal of this exercise is to verify the page title of the contactpage
 */
@Test
public class Exercise3 extends AbstractTestBase {

    public void navigateToContactPage_contactPageShown() {
        getDriver().get("https://practicesoftwaretesting.com");

        getDriver().findElement(By.cssSelector("#contact-link > a")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector("form h3")).getText()).isEqualTo("SEND A MESSAGE");

        // or validation of browser window title
        Assertions.assertThat(getDriver().getTitle()).isEqualTo("Contact us - My e-commerce");

    }
}
