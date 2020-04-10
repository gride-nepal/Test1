package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Landing {

	WebDriver driver;
	
	
	public Landing(WebDriver passedDriver ) {
		driver =passedDriver;
	}
	
	
	By accessCodeField = By.id("search_acode");
	By submitAgentCode = By.id("submit_agentcode");
	By submitcode = By.id("submit_Agent");
	
	By repRegisteration = By.linkText("Rep Registration");
	
	public String getPageTitle() {
		return driver.findElement(By.xpath("//strong[contains(text(),'Please enter your Representative Access Code, to a')]")).getText();
		
	}
	
	
	public void submitAgentCode() {
		driver.findElement(submitAgentCode).click();
	}
	
	public void accesscode(String Code) {
		driver.findElement(accessCodeField).sendKeys(Code);

	}
	
	public String verifyAgentTitle() {
		return driver.findElement(By.xpath("//strong[contains(text(),'Please confirm')]")).getText();
	}
	
	 public void submitAgent() {
		 driver.findElement(submitcode).click();
	 }
	
		public void registerRep() {
			
			driver.findElement(repRegisteration).click();
		}
		
	
} 

		
		
	

