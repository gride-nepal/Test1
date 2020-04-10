package automationFramework;

import org.testng.annotations.Test;

import pages.AddressInfo;
import pages.BusinessInfo;
import pages.ContactInfo;
import pages.Landing;
import pages.PaymentInfo;
import pages.PersonalInfo;
import pages.RegType;
import pages.RepInfo;
import pages.Signature;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RandomTest {
	
	 
	 WebDriver driver;
	
  @Test(enabled=true, priority= 2)
  public void test1() throws InterruptedException {
	  System.out.println("TEST 1");
//	  Landing landing = new Landing(driver);
//		landing.accesscode("NENY0000");
//		landing.submitAgentCode();
//		landing.submitAgent();
//		landing.registerRep();
//		Thread.sleep(5000);
//		
//		RepInfo repInfo = new RepInfo(driver);
//		repInfo.next();
//		Thread.sleep(5000);
//		
//		PersonalInfo personalInfo = new PersonalInfo(driver);
//		personalInfo.fillPersonalInfo("Test", "","Test","123454676","10", "23", "1984");
//		personalInfo.next();
//		Thread.sleep(5000);
	  
  }
  
  @Test(enabled=false,priority= 4)
  public void test2() throws InterruptedException {
	  System.out.println("TEST 2");
//	  ContactInfo contactInfo=new ContactInfo(driver);
//		contactInfo.phonenum("7890008789");
//		contactInfo.details("","saaw@go.com", "34567", "567889");
//		contactInfo.tzone("Samoa (UTC-11)");
//		contactInfo.next();
//		Thread.sleep(5000);
//		
//		AddressInfo addressInfo =new AddressInfo(driver);
//		addressInfo.enterAddress("37873", "2353", "34353", "76556767","Ohio (OH)");
//		addressInfo.stateinfo("Ohio (OH)");
//		addressInfo.next();
//		Thread.sleep(5000); 
  }

  @Test(priority= 1)
  public void test3() throws InterruptedException {
	  System.out.println("TEST 3");
//	  RegType regType = new RegType(driver);
//		regType.regtype("Individual");
//		regType.next();
//		Thread.sleep(5000);
//		
//		BusinessInfo businessInfo = new BusinessInfo(driver);
//		businessInfo.next();
//		Thread.sleep(5000);
  }
  
  
  
  @Test(priority= 1)
  public void test4() throws InterruptedException {
	  System.out.println("TEST 4");
	  String str = "MY TEST";
	  Assert.assertEquals(str,"MY TEST");
//	  PaymentInfo paymentInfo = new PaymentInfo(driver);
//		paymentInfo.payTo("Individual");
//		paymentInfo.paymentInfo("042000013", "6743647", "987483", "");
//		paymentInfo.next();
//		Thread.sleep(5000);
  }
  
  @Test(priority= 3)
  public void test5() {
	  System.out.println("TEST 5");
//		Signature signature = new Signature(driver);
//		String verificationCode = signature.retriveVerificationCode();
//		signature.enterVerificationCode(verificationCode);
  }
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("BEFORE TEST");
//	  System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
//	  driver = new ChromeDriver();
//	  driver.get("https://premierenroll.com");
//		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFTER TEST");
  }

}
