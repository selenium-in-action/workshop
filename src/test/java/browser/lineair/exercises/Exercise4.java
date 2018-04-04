package browser.lineair.exercises;

import org.testng.annotations.Test;

/**
 * The goal of this exercise is to request a new password
 */

@Test
public class Exercise4 extends AbstractTestBase {

    public void requestNewPasswordExistingUser_SuccessMessageShown() {
        driver.get("http://demo.seleniuminaction.com");

//		Assertions.assertThat(messages).contains("There is no account registered for this email address.");
    }

    public void requestNewPasswordNonExistingUser_SuccessMessageShown() {

        // Assertions.assertThat(messages).contains("There is 1 error\nThere is no account registered for this email address.");
    }
}
