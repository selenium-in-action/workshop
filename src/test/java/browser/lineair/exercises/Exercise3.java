package browser.lineair.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * The goal of this exercise is to verify the page title of the contactpage
 *
 */
@Test
public class Exercise3 extends AbstractTestBase {

	public void navigateToContactPage_contactPageShown() {
		// Navigeer naar website
		driver.get("http://demo.seleniuminaction.com");

 		WebElement el = driver.findElement(By.cssSelector("#contact-link > a"));


	}
}
