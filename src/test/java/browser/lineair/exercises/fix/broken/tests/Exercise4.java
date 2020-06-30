package browser.lineair.exercises.fix.broken.tests;

import org.testng.annotations.Test;

/**
 * The goal of this exercise is to request a new password
 */

@Test
public class Exercise4 extends AbstractTestBase {

    public void requestNewPasswordExistingUser_SuccessMessageShown() {
        driver.get("http://demo.seleniuminaction.com");

//        Assertions.assertThat(messages).contains("If this email address has been registered in our shop, you will receive a link to reset your password at test@test.nl.");
    }

}
