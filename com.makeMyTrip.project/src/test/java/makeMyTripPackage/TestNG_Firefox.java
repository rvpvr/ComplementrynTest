package makeMyTripPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Firefox {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void verifyMakeMyTripLogo() {
        try {
            driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[contains(@id,'frame')])[2]")));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();",
                    driver.findElement(By.xpath("//div//a[@class='close']//child::i")));
            driver.switchTo().defaultContent();
            WebElement logoElement = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
            Assert.assertTrue(logoElement.isDisplayed(), "MakeMyTrip logo is present on the page.");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("An error occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
