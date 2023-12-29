package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.baseClass;

public class footerPages extends baseClass {

	

	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[10]/a/img")
	WebElement FWilasaLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[9]/a/img")
	WebElement FSTLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[8]/a/img")
	WebElement FprestigeLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[7]/a/img")
	WebElement fmantriLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[6]/a/img")
	WebElement FbrigadeLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[5]/a/img")
	WebElement FSridakshaLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[4]/a")
	WebElement FNivasanLogo ;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[3]/a/img")
	WebElement FensembeLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[2]/a/img")
	WebElement FStudioLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[2]/div[1]/a/img")
	WebElement FBirlaLogo;
	
	
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[4]/div[3]/a/img")
	WebElement FRVSLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[4]/div[2]/a/img")
	WebElement FKarpagamLogo;
	@FindBy(xpath="/html/body/main/div[6]/div/div[2]/div[4]/div[1]/a/img")
	WebElement FSNSLogo;

	
	@FindBy(xpath="//a [text()=\"About Us\"]")
	WebElement fAboutUs;
	@FindBy(xpath="//a [text()=\"Why choose us\"]")
	WebElement fWhychooseus;
	@FindBy(xpath="//a [text()=\"Careers\"]")
	WebElement fCareers;
	@FindBy(xpath="//a [text()=\"Services\"]")
	WebElement fServices;
	@FindBy(xpath="//a [text()=\"Products\"]")
	WebElement fProducts;
	@FindBy(xpath="//a [text()=\"Training\"]")
	WebElement fTraining;
	@FindBy(xpath="//a [text()=\" Email Address \"]")
	WebElement femail;
	@FindBy(xpath="//a [text()=\"Contact\"]")
	WebElement Contact;
	@FindBy(name = "subscribe")
	WebElement fsubscribe;
	@FindBy(xpath="/html/body/footer/div[2]/div/div/div/div[2]/div/a[1]/i")
	WebElement Ftwtlogo;
	@FindBy(xpath="//i [@class  = \"fab fa-facebook-f\"]")
	WebElement FfbLogo;
	@FindBy(xpath="/html/body/footer/div[2]/div/div/div/div[2]/div/a[3]/i")
	WebElement FlinLogo;
	@FindBy(xpath="/html/body/footer/div[2]/div/div/div/div[2]/div/a[4]/i")
	WebElement FinstaLogo;
	@FindBy(xpath="//*[@id=\"back-top\"]/a/i")
	WebElement FUpArrow;
	@FindBy(xpath="//a [text()=\"Merry's Info-Tech & New-Gen Educare\"]")
	WebElement FMinetextlink;
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
	
	
	
	public footerPages() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotoFBirlaLogo() throws Exception {
		scrollDown();
		waitUntillVisiblity(FBirlaLogo);
		//waitExplicit(FBirlaLogo);
		clickOn(FBirlaLogo);
		
	}
	public void gotoFStudioLogo() {
		jsScrollUntillElement(FStudioLogo);
		waitUntillVisiblity(FStudioLogo);
		clickOn(FStudioLogo);
		
	}
	public void gotoFensembeLogo() {
		jsScrollUntillElement(FensembeLogo);
		waitExplicit(FensembeLogo);
		clickOn(FensembeLogo);
		
	}
	
	public void gotoFNivasanLogo() {
		jsScrollUntillElement(FNivasanLogo);
		waitExplicit(FNivasanLogo);
		clickOn(FNivasanLogo);
		
	}
	
	public void gotoFSridakshaLogo() {
		jsScrollUntillElement(FSridakshaLogo);
		waitExplicit(FSridakshaLogo);
		clickOn(FSridakshaLogo);
		
	}
	public void gotoFbrigadeLogo() {
		jsScrollUntillElement(FbrigadeLogo);
		waitExplicit(FbrigadeLogo);
		clickOn(FbrigadeLogo);
		
	}
	
	public void gotofmantriLogo() {
		jsScrollUntillElement(fmantriLogo);
		waitExplicit(fmantriLogo);
		clickOn(fmantriLogo);
		
	}
	public void gotoFprestigeLogo() {
		jsScrollUntillElement(FprestigeLogo);
		waitExplicit(FprestigeLogo);
		clickOn(FprestigeLogo);
		
	}
	public void gotoFSTLogo() {
		jsScrollUntillElement(FSTLogo);
		waitExplicit(FSTLogo);
		clickOn(FSTLogo);
		
	}
	public void gotoFWilasaLogo() {
		jsScrollUntillElement(FWilasaLogo);
		waitExplicit(FWilasaLogo);
		clickOn(FWilasaLogo);
		
	}

	public void gotoFSNSLogo() {
		jsScrollUntillElement(FSNSLogo);
		waitExplicit(FSNSLogo);
		clickOn(FSNSLogo);
		
	}
	public void gotoFKarpagamLogo() {
		jsScrollUntillElement(FKarpagamLogo);
		waitExplicit(FKarpagamLogo);
		clickOn(FKarpagamLogo);
		
	}
	public void gotoFRVSLogo() {
		jsScrollUntillElement(FRVSLogo);
		waitExplicit(FRVSLogo);
		clickOn(FRVSLogo);
		
	}
		
	public void gotofAboutUs() throws Exception {
		jsScrollUntillElement(fAboutUs);
		waitExplicit(fAboutUs);
		clickOn(fAboutUs);
		Thread.sleep(3000);
		Assert.assertTrue(ContactUslable.isDisplayed());
	}
	
	public void gotofWhychooseus() throws Exception {
		jsScrollUntillElement(fWhychooseus);
		waitExplicit(fWhychooseus);
		clickOn(fWhychooseus);
		Thread.sleep(3000);
		Assert.assertTrue(WhyChooseUslable.isDisplayed());
	}
	
	public void gotofCareers() throws Exception {
		jsScrollUntillElement(fCareers);
		waitExplicit(fCareers);
		clickOn(fCareers);
	}
	
	public void gotofServices() throws Exception {
		jsScrollUntillElement(fServices);
		waitExplicit(fServices);
		clickOn(fServices);
	}
	
	public void gotofProducts() throws Exception {
		jsScrollUntillElement(fProducts);
		waitExplicit(fProducts);
		clickOn(fProducts);
	}
	
	public void gotofTraining() throws Exception {
		jsScrollUntillElement(fTraining);
		waitExplicit(fTraining);
		clickOn(fTraining);
	}
	
	public void gotofemail(String email) throws Exception {
		jsScrollUntillElement(femail);
		waitExplicit(femail);
		clickOn(femail);
		femail.sendKeys(email);
	}
	
	public void gotofsubscribe() throws Exception {
		jsScrollUntillElement(fsubscribe);
		waitExplicit(fsubscribe);
		clickOn(fsubscribe);
	}
	
	
	public void gotofFtwtlogo() {
		jsScrollUntillElement(Ftwtlogo);
		waitExplicit(Ftwtlogo);
		clickOn(Ftwtlogo);
	}
	public void gotoFfbLogo() throws Exception {
		scrollDown();
		clickOn(FfbLogo);
		waitExplicit(FfbLogo);
	//	jsScrollUntillElement(FfbLogo);
		
		//clickOn(FfbLogo);
	}
	public void gotoFlinLogo() throws InterruptedException {
		jsScrollUntillElement(FlinLogo);
		waitExplicit(FlinLogo);
		clickOn(FlinLogo);
	}
	public void gotoFinstaLogo() throws InterruptedException {
		jsScrollUntillElement(FinstaLogo);
		waitExplicit(FinstaLogo);
		clickOn(FinstaLogo);
	}
	
	public void gotoOurFUpArrow() throws InterruptedException {
		jsScrollUntillElement(FUpArrow);
		waitExplicit(FUpArrow);
		clickOn(FUpArrow);

	}
	
	public void gotoFMinetextlink() throws InterruptedException {
		jsScrollUntillElement(FMinetextlink);
		waitExplicit(FMinetextlink);
		clickOn(FMinetextlink);

	}

	
	public void gotoContactUs() throws Exception {
		jsScrollUntillElement(Contact);
		waitExplicit(Contact);
		clickOn(Contact);
		Thread.sleep(3000);
		Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
	
	public void gotoFContactUs() throws Exception {
		jsScrollUntillElement(FreeQuote);
		waitExplicit(FreeQuote);
		clickOn(FreeQuote);
		Thread.sleep(3000);
		Assert.assertTrue(ContactUslable.isDisplayed());
		
		
	}
	

		
	
	

	
	
	
	

}
