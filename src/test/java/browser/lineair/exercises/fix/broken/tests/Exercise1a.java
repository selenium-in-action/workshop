package browser.lineair.exercises.fix.broken.tests;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * The goal of this exercises is to login.
 * 
 */

@Test
public class Exercise1a extends AbstractTestBase {

	public void loginSuccess() {
		driver.get("http://demo.seleniuminaction.com/index.php");

		driver.findElement(By.cssSelector(".login")).click();

		driver.findElement(By.id("email")).sendKeys("tester@test.com");
		driver.findElement(By.id("passwd")).sendKeys("1qazxsw2");
		driver.findElement(By.name("SubmitLogin")).click();

		Assertions.assertThat(driver.findElement(By.cssSelector(".logout")).isDisplayed())
				.isEqualTo(true);
	}

	public void loginAccountDoesNotExist() {
		// Here some code

		Assertions.assertThat(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed()).isEqualTo(true);
	}

}
