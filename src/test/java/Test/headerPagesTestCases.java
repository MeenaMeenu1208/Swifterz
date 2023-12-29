package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.HeaderPages;

public class headerPagesTestCases extends baseClass {
	HeaderPages HDP = new HeaderPages();	
	
    @Test
    public void TC_HeaderPage001() throws InterruptedException {
		HDP.gotoSlogo();
		String exptitle1 = "Home - Swifterz Creative Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}

    @Test
	public void TC_HeaderPage002() throws InterruptedException {

		HDP.gotohomepage();
		String exptitle1 = "Home - Swifterz Creative Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage003() throws InterruptedException {

		HDP.gotoWhoweare();
	
	}
    @Test
    public void TC_HeaderPage004() throws InterruptedException {
		HDP.gotoAboustus();
	
	}
    
    @Test
    public void TC_HeaderPage005() throws InterruptedException {
		HDP.gotoWhyChooseUs();
	
	}
    @Test
    public void TC_HeaderPage006() throws InterruptedException {

		HDP.gotoOurCoreValues();
	
	}
    
    @Test
    public void TC_HeaderPage007() throws InterruptedException {

		HDP.gotoOurTeam();
	
	}
    
    @Test
    public void TC_HeaderPage008() throws InterruptedException {
		HDP.gotoEngServices();
		String exptitle1 = "Services - Swifterz Creative Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage009() throws InterruptedException {
		HDP.gotoProductspage();
		String exptitle1 = "Products - Swifterz Creative Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage010() throws InterruptedException {
		HDP.gotoCareerspage();
		String exptitle1 = "Careers - Swifterz Creative Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    

    @Test
    public void TC_HeaderPage011() throws Exception {
		HDP.gotoContactUs();
	
	}
    
    @Test
    public void TC_HeaderPage012() throws Exception {
		HDP.gotoFContactUs();
	
	}
    
    @Test
    public void TC_HeaderPage013() throws Exception {
		HDP.clickingonNumber();
	
	}
    
    @Test
    public void TC_HeaderPage014() throws Exception {
		HDP.clickingonEmail();
	
	}
  
	
}
