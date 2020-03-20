package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing {
	
	//Class Attribute of Type WebDriver
	WebDriver driver;
	//Making constructor of Landing Page which accepts WebDriver while making object og the Landing Class
	public Landing(WebDriver args) {
		driver = args;
	}
	
	
	By codefield = By.id("search_acode");
	By button = By.id("submit_agentcode");
	
	
	
	

	
	//Method to enter Code in input field
	public void enteraccesscode(String code) {
		
		//Locating Input field from landing page
		WebElement accesscodefield = driver.findElement(codefield);
		
		// and entering value in accesscodeinput field
		accesscodefield.sendKeys(code);
	}
	
	
	public void submitForm() {
		
		WebElement submitButton = driver.findElement(button);
		submitButton.click();
	
		
	}
	
	

}
