package browser.lineair.exercises.fix.broken.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
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

		driver.get("https://practicesoftwaretesting.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click op link
		driver.findElement(By.cssSelector("[data-test='nav-sign-in']")).click();

		driver.findElement(By.id("email")).sendKeys("test" + rand + "@test.nl");
		// driver.findElement(By.name("email")).sendKeys("test".concat(rand).concat("@test.nl"));


	}
}
