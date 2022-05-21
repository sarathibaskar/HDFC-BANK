package step.org;





import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import POM.org.HDFCloginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libGlobal.BaseClass;

public class StepDefinition extends BaseClass{
	
		
	
		
	
		
	public static Logger logger=Logger.getLogger(StepDefinition.class);
	
	
	
	@Given("I am enter the HDFC URL")
	public void i_am_enter_the_HDFC_URL() {
		
		
	}

	@When("I am enter the Invalid {string} And Click Continue Button")
	public void i_am_enter_the_Invalid_And_Click_Continue_Button(String string) {
		PropertyConfigurator.configure("log4j2.properties");
		logger.info("Send the Invalid Customer Id and click the continue button successully");
		HDFCloginPage hdfc=new HDFCloginPage();
		frameByIndex(0);
		hdfc.getUserid().sendKeys(string);
		hdfc.getContinue().click();
	
		
		
	}

	@When("I am enter Password {string} And Click Login Button")
	public void i_am_enter_Password_And_Click_Login_Button(String string) {
		
		logger.info("Send the Invalid Password And click the continue button successully");  
		HDFCloginPage hdfc2=new HDFCloginPage();
		hdfc2.getPasswod().sendKeys(string);
		hdfc2.getLogin().click();
		
		
		
	}

	@Then("I will verfying the Invalid username or password error messaging dispalyed")
	public void i_will_verfying_the_Invalid_username_or_password_error_messaging_dispalyed() {
		logger.error("successully getting the invalid text");
	
	System.out.println(findElementByXpath("//span[contains(text(),'ID and IPIN do not match. Please try again')]").getText());
	
		//Your ID and IPIN do not match. Please try again
	
	
	}

	
}
