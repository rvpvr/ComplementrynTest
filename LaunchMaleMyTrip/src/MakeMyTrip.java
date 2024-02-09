public class MakeMyTrip {

	public static void main(String[] args) {
		      

	//Set the path to the Firefox WebDriver executable
	 System.setProperty("webdriver.gecko.driver","D:\\Firefoxdriver\\geckodriver.exe");
	

	// Create a new instance of the Firefox driver
	    FirefoxOptions options = new FirefoxOptions();
	    WebDriver driver = new FirefoxDriver(options);

	//Navigate to the MakeMyTrip website
	driver.get("https://www.makemytrip.com/");

	try {
	    //Wait for the logo to be present on the page
	    logo_element = WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH,"//img[@alt='MakeMyTrip']"))	    )

	    //If the logo is present, print a success message
	    System.out.println("MakeMyTrip logo is present on the page.");
	}catch(Exception e){
	    //If the logo is not present, print an error message
		System.out.println("MakeMyTrip logo is not present on the page.");
	}

	finally {
	    //Close the browser window
	    driver.quit();

}
}
}