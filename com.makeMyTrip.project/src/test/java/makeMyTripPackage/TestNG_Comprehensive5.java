package makeMyTripPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Comprehensive5 {

	private WebDriver driver = null;
	private final String appUrl = "https://www.makemytrip.com/";

	@BeforeMethod
	public void setBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void launchAppAndVerifyLogo() {

		driver.get(appUrl);

		WebElement logoElement = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));

		if (logoElement.isDisplayed()) {

			System.out.println("MakeMyTrip logo is present on the page.");
		} else {
			System.out.println("MakeMyTrip logo is not present on the page.");
		}

	}

	@Test(priority = 2)
	public void launchAppAndSelectOneway() throws InterruptedException {

		driver.get(appUrl);

		WebElement flight = driver
				.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']"));
		flight.click();

		Thread.sleep(3000);
		WebElement from2 = driver.findElement(By.id("fromCity"));
		from2.sendKeys("Chennai, India");

		Thread.sleep(3000);
		WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
		chennai.click();

		Thread.sleep(3000);
		WebElement to2 = driver.findElement(By.xpath("//input[@id='toCity']"));
		to2.sendKeys("Mumbai, India");

		Thread.sleep(3000);
		WebElement mumbai = driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]"));
		Thread.sleep(3000);
		mumbai.click();

		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Thu Feb 15 2024']"));
		date.click();

		Thread.sleep(3000);
		WebElement Searchclick = driver.findElement(By.partialLinkText("SEAR"));
		Thread.sleep(3000);
		Searchclick.click();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}