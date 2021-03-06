package browser.structured.answers;

import com.google.common.base.Function;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * The goal of this exercises is to fix the broken tests.
 */
@Test
public class Exercise1c extends AbstractTestBase {

    public void waitForCountDown() {
        // Open website
        getDriver().get("https://stuntcoders.com/snippets/javascript-countdown/");

        WebElement countdown = getDriver().findElement(By.id("javascript_countdown_time"));

        System.out.println(countdown.getText());

        // Wait till the countdown reached ..
        new FluentWait<WebElement>(countdown).withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofMillis(250)).until(new Function<WebElement, Boolean>() {
            @Override
            public Boolean apply(final WebElement el) {
                System.out.println(el.getText());
                return el.getText().endsWith("02");
            }
        });
        System.out.println("Yeah, passed the first check!");

        waitForCountDownIs(countdown, "01:01:00");
        Assertions.assertThat(countdown.getText()).isEqualTo("01:01:00");
    }

    private void waitForCountDownIs(final WebElement countdown, final String endTime) {
        new FluentWait<WebElement>(countdown).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(250))
                .until(new Function<WebElement, Boolean>() {
                    @Override
                    public Boolean apply(final WebElement el) {
                        System.out.println(el.getText());
                        return el.getText().equals(endTime);
                    }
                });
    }

}
