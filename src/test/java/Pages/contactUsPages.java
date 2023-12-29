package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class contactUsPages extends baseClass {
	@FindBy(name="name")
	WebElement CName;
	@FindBy(name="email")
	WebElement Cemail;
	@FindBy(name="contact")
	WebElement CphoneNo;
	@FindBy(name="message")
	WebElement Cmessage;
	@FindBy(name="signup-btn")
	WebElement Csignupbtn;

	public contactUsPages() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void gotoContactUsPage(String cname, String cemail, String cphoneNo, String cmessage ) {
		clickOn(CName);
		type(CName, cname);
		type(Cemail, cemail);
		type(CphoneNo, cphoneNo);
		type(Cmessage, cmessage);
		clickOn(Csignupbtn);
		
	}
	
	
	

}
