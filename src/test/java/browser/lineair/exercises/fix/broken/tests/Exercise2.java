package browser.lineair.exercises.fix.broken.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * The goal of this exercise is to search for products.
 */
@Test
public class Exercise2 extends AbstractTestBase {

    public void submitSearch_shouldDisplayResult() {
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Java 7
        // final List<String> productNames = new ArrayList<>();
        // final List<WebElement> nameEl = driver.findElements(By.cssSelector("[data-test='product-name']"));
        // for (final WebElement el : nameEl) {
        // productNames.add(el.getText());
        // }

        // Java 8
        final List<String> productNames = driver.findElements(By.cssSelector("[data-test='product-name']")).stream().map(WebElement::getText)
                .collect(Collectors.toList());

        System.out.println(productNames.toString());

        Assertions.assertThat(productNames).contains("Some product");

    }
}
