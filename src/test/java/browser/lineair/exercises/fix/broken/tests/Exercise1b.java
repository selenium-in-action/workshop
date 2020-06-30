package browser.lineair.exercises.fix.broken.tests;

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

		// click op link
		driver.findElement(By.cssSelector(".login")).click();

		driver.findElement(By.id("email")).sendKeys("test" + rand + "@test.nl");
		// driver.findElement(By.name("email")).sendKeys("test".concat(rand).concat("@test.nl"));

		// h1 is niet goed
		String title = driver.findElement(By.tagName("h1")).getText();
		System.out.println(title);

		driver.findElement(By.cssSelector("button[data-link-action='save-customer']")).click();


		Assertions.assertThat(title).isEqualTo("Create an account");

		Assertions.assertThat(driver.findElement(By.cssSelector(".logout")).isDisplayed())
				.isEqualTo(true);
	}
}
