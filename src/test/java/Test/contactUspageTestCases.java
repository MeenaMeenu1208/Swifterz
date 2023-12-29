package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.contactUsPages;

public class contactUspageTestCases extends baseClass {
	contactUsPages CP = new contactUsPages();
	
	@BeforeTest
	public void declareSheetName() {
		sheetName="ContactUs";
	}
	
	 @Test(dataProvider = "SwifterzExcelData")
		public void TC_FooterPage021(String cname, String cemail, String cphoneNo, String cmessage) throws Exception {
		 CP.gotoContactUsPage( cname, cemail, cphoneNo, cmessage); 	
		}
	    	
    

}
