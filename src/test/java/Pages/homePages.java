package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.baseClass;

public class homePages extends baseClass{
	
	@FindBy(xpath="//a [@href = \"#about\"] [@class=\"btn hero-btn\"]")
	WebElement learnMorebtn;
	@FindBy(xpath="//span [text()=\\\"About Us\\\"]")
	WebElement aboutUslable;
	
	public homePages() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotoaboutusPage() {
		clickOn(learnMorebtn);
		Assert.assertTrue(aboutUslable.isDisplayed());
		
	}
	
	
	
}
