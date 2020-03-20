package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Confirmation;
import pages.Landing;

public class RegressionTest {

	public static void main(String[] args) {
		// Inorder to use chrome browser for our test we need to set chrome driver location
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		
		//We are makeing an object of WebDriver and assigning ChromeDriver inorder to use chrome browser which opens browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to home Page 
		driver.get("https://premierenroll.com/access-lock.php");
		
		//Maximize Browser Window Size
		driver.manage().window().maximize();
		
		//Making Object of Landing so we can interact with the web elements
		Landing landing = new Landing(driver);
		
		//Using enteraccesscode method from Landing Class
		landing.enteraccesscode("NENY0000");
		landing.submitForm();
		
		Confirmation confirmation = new Confirmation(driver);
		confirmation.verifyPageTitle();
		
		confirmation.retriveTitle();
		
		confirmation.clickConfirmButton();
		
		
		

	}

}
