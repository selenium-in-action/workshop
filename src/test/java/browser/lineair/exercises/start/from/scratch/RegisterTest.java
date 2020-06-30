package browser.lineair.exercises.start.from.scratch;

import org.testng.annotations.Test;

@Test
public class RegisterTest extends AbstractTestBase {

    public void registerNewAccount() {
        driver.get("http://demo.seleniuminaction.com");
    }
}
