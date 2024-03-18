package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Mansheen");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lastnameElement = driver.findElement(By.id("lastname"));
		lastnameElement.sendKeys("Kaur");
		
		WebElement numberElement = driver.findElement(By.id("phoneNumber"));
		numberElement.sendKeys("4545466233");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("mansheenkaur2000@gmail.com");

		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("mansheen");
		
		WebElement confirmPasswordElement = driver.findElement(By.id("confirmPassword"));
		confirmPasswordElement.sendKeys("mansheen1");
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		WebElement createAccountButton = driver.findElement(By.xpath("//button[text()='Create account']"));
        createAccountButton.click();
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
	
	public static void best_buy_registration_page(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		driver.get(url);
		
		WebElement emailField = driver.findElement(By.id("FormField_1_input"));
        emailField.sendKeys("Mansheenkaur2000@gmail.com");
        
        WebElement passwordField = driver.findElement(By.id("FormField_2_input"));
        passwordField.sendKeys("TestHybridPassword@123");
        
        WebElement confirmPasswordField = driver.findElement(By.id("FormField_3_input"));
        confirmPasswordField.sendKeys("TestHybridPassword");
		
		WebElement firstNameField = driver.findElement(By.id("FormField_4_input"));
		firstNameField.sendKeys("Mansheen");
		
		WebElement lastNameField = driver.findElement(By.id("FormField_5_input"));
        lastNameField.sendKeys("Kaur");
        
        WebElement companyField = driver.findElement(By.id("FormField_6_input"));
        companyField.sendKeys("Test Company");
        
        WebElement phoneNumberField = driver.findElement(By.id("FormField_7_input"));
        phoneNumberField.sendKeys("0476765642");
        
        WebElement addressLine1Field = driver.findElement(By.id("FormField_8_input"));
        addressLine1Field.sendKeys("1354/45");
        
        WebElement addressLine2Field = driver.findElement(By.id("FormField_9_input"));
        addressLine2Field.sendKeys("Dandenong Rd");
        
        WebElement suburbField = driver.findElement(By.id("FormField_10_input"));
        suburbField.sendKeys("Melbourne");
        
        WebElement countryField = driver.findElement(By.id("FormField_11_select"));
        new Select(countryField).selectByVisibleText("Australia");
        
        sleep(2);
        
        WebElement stateField = driver.findElement(By.id("FormField_12_input"));
        new Select(stateField).selectByVisibleText("Victoria");
        
        WebElement pincodeField = driver.findElement(By.id("FormField_13_input"));
        pincodeField.sendKeys("3148");
      
		WebElement createAccountButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Create Account']"));
        createAccountButton.click();
		
		sleep(2);
		
		driver.close();	
	}
	
}
