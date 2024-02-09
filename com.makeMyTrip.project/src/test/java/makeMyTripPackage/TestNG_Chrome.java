package makeMyTripPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Chrome {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void searchFlight() {
        try {
            WebElement flight = driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']"));
            flight.click();

            WebElement fromCity = driver.findElement(By.id("fromCity"));
            fromCity.sendKeys("Chennai, India");

            WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
            chennai.click();

            WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
            toCity.sendKeys("Mumbai, India");

            WebElement mumbai = driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]"));
            mumbai.click();

            WebElement date = driver.findElement(By.xpath("//div[@aria-label='Thu Feb 15 2024']"));
            date.click();

            WebElement searchButton = driver.findElement(By.partialLinkText("SEAR"));
            searchButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
