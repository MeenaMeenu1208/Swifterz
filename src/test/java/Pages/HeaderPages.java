package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.baseClass;

public class HeaderPages extends baseClass {
     

	
	@FindBy(xpath="//a [text()=\"Home\"]")
	WebElement home;
	@FindBy(xpath="//a [text()=\"Who we are \"]")
	WebElement whoWeare;
	@FindBy(xpath="//a [text()=\"Academy \"]")
	WebElement Academy;
	@FindBy(xpath="//a [text()=\"Services\"]")
	WebElement Services;
	@FindBy(xpath="//a [text()=\"Products\"]")
	WebElement Products;
	@FindBy(xpath="//a [text()=\"Elevate2k24 \"]")
	WebElement Elevate2k24;
	@FindBy(xpath="//a [text()=\"Careers \"]")
	WebElement Careers;
	@FindBy(xpath="//a [text()=\"Contact\"]")
	WebElement Contact;
	@FindBy(xpath="//a [text()=\"Learn More \"]")
	WebElement LearnMore;
	@FindBy(xpath="//img [@alt=\"Swifterz Creative Services\"]")
	WebElement Slogo;
	@FindBy(xpath="/html/body/header/div/div/div[2]/div/div/div[1]/a/div/img")
	WebElement SwzLogo;
	@FindBy(xpath="//a [text()=\"ACCA Edificius\"]")
	WebElement ACCAEdificius;
	@FindBy(xpath="//a [text()=\"About us\"]")
	WebElement aboutUs;
	@FindBy(xpath="//span [text()=\"About Us\"]")
	WebElement aboutUslable;
	@FindBy(xpath="//a [text()=\"Why Choose Us\"]")
	WebElement WhyChooseUs;
	@FindBy(xpath="//span [text()=\"Why Choose Us\"]")
	WebElement WhyChooseUslable;
	@FindBy(xpath="//a [text()=\"Our Core Values\"]")
	WebElement OurCoreValues;
	@FindBy(xpath="//span [text()=\"Our Core Values\"]")
	WebElement OurCoreValueslable;
	
	@FindBy(xpath="//a [text()=\"Our Team\"]")
	WebElement OurTeam;
	@FindBy(xpath="//h2 [text()=\"Our Team\"]")
	WebElement OurTeamlable;
	@FindBy(xpath="//li [text()=\"Engineering Services                                                                    \"]")
	WebElement EngServices;
	@FindBy(xpath="//span [text()=\"Contact Us\"]")
	WebElement ContactUslable;
	@FindBy(xpath="//a [text()=\"Free Quote \"]")
	WebElement FreeQuote ;
	@FindBy(xpath="//a [text()=\" +91 98940 55835\"]")
	WebElement hdnumber;
	@FindBy(xpath="//a [text()=\"bim@swifterz.co\"]")
	WebElement hdemail;
	
	
	
	public HeaderPages() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotohomepage() {
		waitExplicit(home);
		clickOn(home);
		
	}
		
	public void gotoProductspage() {
		waitExplicit(Products);
		clickOn(Products);
		waitExplicit(ACCAEdificius);
		clickOn(ACCAEdificius);
		
	}
	
	public void gotoCareerspage() {
		waitExplicit(Careers);
		clickOn(Careers);
	}
	public void gotoWhoweare() {
		waitExplicit(whoWeare);
		clickOn(whoWeare);
		Assert.assertTrue(aboutUslable.isDisplayed());
	}
	public void gotoAboustus() throws InterruptedException {
		waitExplicit(whoWeare);
		clickOn(whoWeare);
		waitExplicit(aboutUs);
		clickOn(aboutUs);
		Thread.sleep(3000);
		Assert.assertTrue(aboutUslable.isDisplayed());
	}
	public void gotoWhyChooseUs() throws InterruptedException {
		waitExplicit(whoWeare);
		clickOn(whoWeare);
		waitExplicit(WhyChooseUs);
		clickOn(WhyChooseUs);
		Thread.sleep(3000);
		Assert.assertTrue(WhyChooseUslable.isDisplayed());
		
	}
	public void gotoOurCoreValues() throws InterruptedException {
		
		clickOn(whoWeare);
		waitExplicit(OurCoreValues);
		clickOn(OurCoreValues);
		Thread.sleep(3000);
		Assert.assertTrue(WhyChooseUslable.isDisplayed());
	}
	
	public void gotoOurTeam() throws InterruptedException {
		
		clickOn(whoWeare);
		waitExplicit(OurTeam);
		clickOn(OurTeam);
		Thread.sleep(3000);
		Assert.assertTrue(OurTeamlable.isDisplayed());
	}
	public void gotoEngServices() {
		waitExplicit(Services);
		clickOn(Services);
		waitExplicit(EngServices);
		clickOn(EngServices);
	}
	public void gotoSlogo() {
		waitExplicit(Slogo);
		clickOn(Slogo);
	}
	
	public void gotoContactUs() throws Exception {
		waitExplicit(Contact);
		clickOn(Contact);
		Thread.sleep(3000);
		Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
	
	public void gotoFContactUs() throws Exception {
		waitExplicit(FreeQuote);
		clickOn(FreeQuote);
		Thread.sleep(3000);
		Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
	
	public void clickingonNumber() throws Exception {
		waitExplicit(hdnumber);
		clickOn(hdnumber);
		Thread.sleep(3000);
		//Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
		
	public void clickingonEmail() throws Exception {
		waitExplicit(hdemail);
		clickOn(hdemail);
		Thread.sleep(3000);
	//	Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
			
		
	
	

	
}
