package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class FirstTestcase {

	public static void main(String[] args) throws InterruptedException {
		 
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://premierenroll.com");
		
		driver.manage().window().maximize();
		
		Landing landing = new Landing(driver);
		landing.accesscode("NENY0000");
		landing.submitAgentCode();
		landing.submitAgent();
		landing.registerRep();
		
		Thread.sleep(5000);
		
		RepInfo repInfo = new RepInfo(driver);
		repInfo.next();
		
		Thread.sleep(5000);
		
		PersonalInfo personalInfo = new PersonalInfo(driver);
		personalInfo.fillPersonalInfo("Test", "","Test","123454676","10", "23", "1984");
		personalInfo.next();
		
		Thread.sleep(5000);
		
		ContactInfo contactInfo=new ContactInfo(driver);
		contactInfo.phonenum("7890008789");
		contactInfo.details("","saaw@go.com", "34567", "567889");
		contactInfo.tzone("Samoa (UTC-11)");
		contactInfo.next();
		
		Thread.sleep(5000);
		
		AddressInfo addressInfo =new AddressInfo(driver);
		addressInfo.enterAddress("37873", "2353", "34353", "76556767","Ohio (OH)");
		addressInfo.stateinfo("Ohio (OH)");
		addressInfo.next();
		
		Thread.sleep(5000);
		
		RegType regType = new RegType(driver);
		regType.regtype("Individual");
		regType.next();
		
		Thread.sleep(5000);
		
		BusinessInfo businessInfo = new BusinessInfo(driver);
		businessInfo.next();
		
		Thread.sleep(5000);
		
		PaymentInfo paymentInfo = new PaymentInfo(driver);
		paymentInfo.payTo("Individual");
		paymentInfo.infopayment("042000013", "6743647", "987483", "");
		paymentInfo.next();
		
		
	
		
		
		Thread.sleep(5000);
		
		Signature signature = new Signature(driver);
		String verificationCode = signature.retriveVerificationCode();
		signature.enterVerificationCode(verificationCode);
	}
		 
}
		
		
		
		
		
		
		
//new WebDriverWait(driver, 20)
//.until(ExpectedConditions.elementToBeClickable(By.id("agent_fname")))
//.click();

//	landing.myname("Dipika");