package makeMyTripPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip_Firefox {

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// Navigate to the MakeMyTrip website
		driver.get("https://www.makemytrip.com/");

//		Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			// If the logo is present, print a success message
			driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[contains(@id,'frame')])[2]")));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//div//a[@class='close']//child::i")));
			driver.switchTo().defaultContent();
			WebElement logoElement = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
			if (logoElement.isDisplayed()) {

				System.out.println("MakeMyTrip logo is present on the page.");
			} else {
				System.out.println("MakeMyTrip logo is not present on the page.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			// Close the browser window
			driver.quit();
		}
	}
}