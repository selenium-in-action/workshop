package browser.lineair.exercises;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * The goal of this exercises is to register a new account
 *
 */
@Test
public class Exercise1b extends AbstractTestBase {

	public void registerNewAccount() {
		final String rand = Integer.toString(new Random().nextInt());

		driver.get("http://demo.seleniuminaction.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		Assertions.assertThat(driver.findElement(By.cssSelector("div#center_column > p")).getText()).isEqualTo("Your account has been created.");
	}
}
