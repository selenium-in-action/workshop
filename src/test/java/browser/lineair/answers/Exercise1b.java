package browser.lineair.answers;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
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

		getDriver().get("http://demo.seleniuminaction.com/index.php");
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		getDriver().findElement(By.cssSelector(".user-info a")).click();

		getDriver().findElement(By.cssSelector(".no-account a")).click();

		getDriver().findElement(By.cssSelector("input[name='id_gender'][value='2']")).click();
		getDriver().findElement(By.name("firstname")).sendKeys("T");
		getDriver().findElement(By.name("lastname")).sendKeys("Tester");
		getDriver().findElement(By.name("email")).sendKeys("test".concat(rand).concat("@example.com"));
		getDriver().findElement(By.name("password")).sendKeys("1qazxsw2");

		getDriver().findElement(By.name("birthday")).sendKeys("1/1/1970");

		getDriver().findElement(By.name("psgdpr")).click();

		getDriver().findElement(By.cssSelector("button[data-link-action='save-customer']")).click();

		Assertions.assertThat(getDriver().findElement(By.cssSelector(".logout")).isDisplayed())
				.isEqualTo(true);
	}
}
