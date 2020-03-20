package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmation {
	WebDriver driver;
	
	public Confirmation(WebDriver args) {
		driver = args;
		
	}
	
	By title = By.className("heading-primary");
	By confirmButton = By.id("submit_Agent");
	
	
	public void retriveTitle() {
		WebElement verify = driver.findElement(title);
		System.out.println(verify.getText());
		
	}
	
	
	public void verifyPageTitle() {
		System.out.println(driver.getTitle());
	}
	
	
	public void clickConfirmButton() {
		driver.findElement(confirmButton).click();
	}

}
