package browser.lineair.exercises.fix.broken.tests;

import org.testng.annotations.Test;

/**
 * The goal of this test is to complete the contactform
 *
 */
@Test
public class Exercise5 extends AbstractTestBase {

	public void completeContactForm_confirmationShown() {
		driver.get("http://demo.seleniuminaction.com/contact-us");

	}

	public void invalidEmailGiven_shouldShowErrorMessage() {

	}
}
