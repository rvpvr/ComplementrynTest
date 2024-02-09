package makeMyTripPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement flight=driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']"));
//		wait.until(ExpectedConditions.visibilityOf(flight));
		flight.click();
		
//		Thread.sleep(5000);
//		WebElement from1=driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[1]"));
//		wait.until(ExpectedConditions.visibilityOf(from1));
//		wait.until(ExpectedConditions.elementToBeClickable(from1));
//		from1.click();
		
		Thread.sleep(3000);
		WebElement from2=driver.findElement(By.id("fromCity"));
//		wait.until(ExpectedConditions.visibilityOf(from2));
		from2.sendKeys("Chennai, India");
		
		Thread.sleep(3000);
		WebElement chennai=driver.findElement(By.xpath("//p[text()='Chennai, India']"));
		chennai.click();
		
//		Thread.sleep(5000);
//		WebElement to1=driver.findElement(By.xpath("//span[text()='To']"));
//		wait.until(ExpectedConditions.visibilityOf(to1));
//		to1.click();
		
		Thread.sleep(3000);
		WebElement to2=driver.findElement(By.xpath("//input[@id='toCity']"));
		//wait.until(ExpectedConditions.visibilityOf(to2));
		to2.sendKeys("Mumbai, India");
		
		Thread.sleep(3000);
		WebElement mumbai=driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]"));
		Thread.sleep(3000);
		mumbai.click();
		
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.xpath("//div[@aria-label='Thu Feb 15 2024']"));
		date.click();
		
		
		Thread.sleep(3000);
		WebElement Searchclick=driver.findElement(By.partialLinkText("SEAR"));
		Thread.sleep(3000);
		
		Searchclick.click();

		
		
		//WebElement mumbai=driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
	//	mumbai.click();
		
//		Thread.sleep(5000);
//		WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
//		wait.until(ExpectedConditions.visibilityOf(search));
//		wait.until(ExpectedConditions.elementToBeClickable(search));
//		search.click();
		

	}

}
