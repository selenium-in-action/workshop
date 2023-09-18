package browser.lineair.answers;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * The goal of this exercises is to login.
 */

@Test
public class Exercise1a extends AbstractTestBase {

    public void loginSuccess() {
        getDriver().get("https://practicesoftwaretesting.com");

        getDriver().findElement(By.cssSelector(".login")).click();

        getDriver().findElement(By.name("email")).sendKeys("tester@test.com");
        getDriver().findElement(By.name("passwd")).sendKeys("1qazxsw2");
        getDriver().findElement(By.id("SubmitLogin")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".logout")).isDisplayed())
                .isEqualTo(true);
    }

    public void loginAccountDoesNotExist() {

        getDriver().get("https://practicesoftwaretesting.com");

        getDriver().findElement(By.cssSelector(".login")).click();

        getDriver().findElement(By.name("email")).sendKeys("1234@test.com");
        getDriver().findElement(By.name("passwd")).sendKeys("1qazxsw2");
        getDriver().findElement(By.id("SubmitLogin")).click();

        Assertions.assertThat(getDriver().findElement(By.cssSelector(".alert-danger")).isDisplayed()).isEqualTo(true);
    }

}
