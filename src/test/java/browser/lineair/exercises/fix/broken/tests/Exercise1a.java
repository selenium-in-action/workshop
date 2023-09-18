package browser.lineair.exercises.fix.broken.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * The goal of these exercises is to log in.
 * 
 */

@Test
public class Exercise1a extends AbstractTestBase {

	public void loginSuccess() {
		driver.get("https://practicesoftwaretesting.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.cssSelector("[data-test='nav-sign-in']")).click();

		driver.findElement(By.cssSelector("[data-test='email']")).sendKeys("customer@practicesoftwaretesting.com");
		driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("welcome01");
		driver.findElement(By.cssSelector("[data-test='login-submit']")).click();

		Assertions.assertThat(driver.findElement(By.xpath("//h1[text() = 'My account']")).isDisplayed())
				.isEqualTo(true);
	}

	public void loginAccountDoesNotExist() {
		// Here some code

		Assertions.assertThat(driver.findElement(By.cssSelector(".alert-danger")).getText()).isEqualTo("Invalid email or password");
	}

}
