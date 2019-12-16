package browser.lineair.answers;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The goal of this exercise is to request a new password
 */

@Test
public class Exercise4 extends AbstractTestBase {

    public void requestNewPasswordExistingUser_SuccessMessageShown() {
        getDriver().get("http://demo.seleniuminaction.com/index.php");

        getDriver().findElement(By.cssSelector(".user-info a")).click();
        getDriver().findElement(By.cssSelector(".forgot-password a")).click();

        getDriver().findElement(By.name("email")).sendKeys("-1137205466tetser@test.com");
        getDriver().findElement(By.cssSelector("form.forgotten-password button")).click();

        // List van WebElementen uitlezen
//        final List<WebElement> errorMessages = getDriver().findElements(By.cssSelector(".ps-alert-success p"));
//        final List<String> errorList = new ArrayList<String>();
//        for (WebElement el : errorMessages) {
//            errorList.add(el.getText());
//        }

        final List<String> messages = getDriver().findElements(By.cssSelector(".ps-alert-success p")).stream().map(WebElement::getText).collect(Collectors.toList());

        Assertions.assertThat(messages).contains("If this email address has been registered in our shop, you will receive a link to reset your password at -1137205466tetser@test.com.");
    }

}
