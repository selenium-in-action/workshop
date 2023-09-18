package browser.lineair.exercises.fix.broken.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

@Test
public class AssertExamples extends AbstractTestBase{


    /**
     * - String assert
     * - int assert
     * - boolean assert
     * - list assert
     *
     *
     */


    public void assertString() {

        driver.get("https://practicesoftwaretesting.com");
        WebElement el = driver.findElement(By.cssSelector("[data-test='nav-sign-in']"));

        System.out.println(el.toString());

        Assertions.assertThat(el.getText()).isEqualTo("verwachte waarde");

    }

    public void booleanAssert() {
        driver.get("https://practicesoftwaretesting.com");
        WebElement el = driver.findElement(By.cssSelector("[data-test='nav-sign-in']"));

        Assertions.assertThat(el.isDisplayed())
                .as("Login button is zichtbaar")
                .isEqualTo(false);
    }


    public void listAssert() {
        driver.get("https://practicesoftwaretesting.com");
        List<String> list = driver.findElements(By.cssSelector("[data-test='product-name']")).stream().map(WebElement::getText).collect(Collectors.toList());


        Assertions.assertThat(list).containsExactly("product 1", "product 2");


    }




}
