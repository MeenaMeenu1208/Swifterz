package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class JobPages extends baseClass{
	
	CareersPage CP = new CareersPage();

	@FindBy(xpath="//button")
	WebElement applynowbtn;
	@FindBy(name="name")
	WebElement JPname;
	@FindBy(name="email")
	WebElement JPemail;
	@FindBy(name="contact")
	WebElement JPcontact;
	@FindBy(id="pdf")
	WebElement ChooseFile;
	@FindBy(className="submit-btn2")
	WebElement SubmitBtn;
	
	
	public JobPages() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotoHVACDesignjob(String name,String email, String contact) {
		CP.gotoHVACDesignbtn();
		clickOn(applynowbtn);
		type(JPname, name);
		type(JPemail, email);
		type(JPcontact, contact);
		clickOn(SubmitBtn);
	}
	public void gotoPHEandFFDesignjob(String name,String email, String contact) {
		CP.gotoPHEandFFDesignbtn();
		clickOn(applynowbtn);
		type(JPname, name);
		type(JPemail, email);
		type(JPcontact, contact);
		clickOn(SubmitBtn);
	}
	
	public void gotoElectricalDesignjob(String name,String email, String contact) {
		CP.gotoElectricalDesign();
		clickOn(applynowbtn);
		type(JPname, name);
		type(JPemail, email);
		type(JPcontact, contact);
		clickOn(SubmitBtn);
	}
	
	public void gotoBIMModelerjob(String name,String email, String contact) {
		CP.gotoBIMModeler();
		clickOn(applynowbtn);
		type(JPname, name);
		type(JPemail, email);
		type(JPcontact, contact);
		clickOn(SubmitBtn);
	}
	
	public void gotoBIMTrainerjob(String name,String email, String contact) {
		CP.gotoBIMTrainer();
		clickOn(applynowbtn);
		type(JPname, name);
		type(JPemail, email);
		type(JPcontact, contact);
		clickOn(SubmitBtn);
	}
	
}

