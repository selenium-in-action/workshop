package browser.lineair.exercises.fix.broken.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenWebsite {

    @Test
    public void openSite() {
        WebDriver driver = new FirefoxDriver();

//        driver.manage().window().maximize();
//
//        driver.findElement(By.cssSelector("input")).clear();
//        driver.findElement(By.cssSelector("input")).sendKeys("");
//
//        WebElement el = driver.findElement(By.cssSelector("input"));
//        el.clear();
//        el.sendKeys("");

        driver.get("http://www.google.com");

        driver.quit();
    }
}
