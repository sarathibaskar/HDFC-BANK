package POM.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libGlobal.BaseClass;

public class HDFCloginPage extends BaseClass {
	
	public HDFCloginPage() {
      PageFactory.initElements(driver, this);
	}
	@FindBy(name="fldLoginUserId")
	private WebElement userid;
	
	@FindBy(xpath="//a[text()='CONTINUE']")
	private WebElement Continue;
	
	@FindBy(id="fldPasswordDispId")
	private WebElement passwod;
	
	@FindBy(xpath="//a[@class='btn btn-primary login-btn']")
	private WebElement login;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getPasswod() {
		return passwod;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
