package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.footerPages;

public class footerTestCases extends baseClass {
	footerPages FDP = new footerPages();	
		
	    @Test
	    public void TC_FooterPage001() throws Exception {


	    	scrollDown();
	    	FDP.gotoFBirlaLogo();
			String exptitle1 = "Birla Apple Spire";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}

	    @Test
		public void TC_FooterPage002() throws InterruptedException {

			FDP.gotoFStudioLogo();
			String exptitle1 = "Studio Chintala";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage003() throws InterruptedException {

			FDP.gotoFensembeLogo();
			String exptitle1 = "www.ensemblearchitects.com";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    
	    @Test
		public void TC_FooterPage004() throws InterruptedException {

			FDP.gotoFNivasanLogo();
			String exptitle1 = "Luxury Villas in Coimbatore | Premium Villas - Nivasan Homes";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage005() throws InterruptedException {

			FDP.gotoFSridakshaLogo();
			String exptitle1 = "Sree Daksha | Home";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage006() throws InterruptedException {

			FDP.gotoFbrigadeLogo();
			String exptitle1 = "www.brigadegroup.com";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage007() throws InterruptedException {

			FDP.gotofmantriLogo();
			String exptitle1 = "mantri.in";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    @Test
		public void TC_FooterPage008() throws InterruptedException {

			FDP.gotoFprestigeLogo();
			String exptitle1 = "www.prestigeconstructions.com";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}	    
	    
	    @Test
		public void TC_FooterPage009() throws InterruptedException {

			FDP.gotofmantriLogo();
			String exptitle1 = "mantri.in";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage010() throws InterruptedException {

			FDP.gotoFSTLogo();
			String exptitle1 = "S&T Interiors and Contracting";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    
	    @Test
		public void TC_FooterPage011() throws InterruptedException {

			FDP.gotoFWilasaLogo();
			String exptitle1 = "Wilasa | Wilasa Grand Villaments";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage012() throws InterruptedException {

			FDP.gotoFSNSLogo();
			String exptitle1 = "SNS Institutions, Coimbatore";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage013() throws InterruptedException {

			FDP.gotoFKarpagamLogo();
			String exptitle1 = "Center of Excellence | Private Colleges in Coimbatore";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage014() throws InterruptedException {

			FDP.gotoFRVSLogo();
			String exptitle1 = "RVS College of Engineering and Technology | Best Engineering College in Coimbatore";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    			
	    @Test
		public void TC_FooterPage015() throws Exception {

			FDP.gotofAboutUs();
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage016() throws Exception {

			FDP.gotofWhychooseus();
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage017() throws Exception {

			FDP.gotofCareers();
			String exptitle1 = "Careers - Swifterz Creative Services";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    	    
	    @Test
		public void TC_FooterPage018() throws Exception {

			FDP.gotofServices();
			String exptitle1 = "Services - Swifterz Creative Services";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage019() throws Exception {

			FDP.gotofProducts();
			String exptitle1 = "Products - Swifterz Creative Services";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
	    @Test
		public void TC_FooterPage020() throws Exception {

			FDP.gotofTraining();
			String exptitle1 = "Training - Swifterz Creative Services";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	    
		@BeforeTest
		public void declareSheetName() {
			sheetName="Footer";
		}
	    
	    @Test(dataProvider = "SwifterzExcelData")
		public void TC_FooterPage021(String email) throws Exception {
	    	FDP.gotofemail(email); 	
		}
	    	
	    @Test
			public void TC_FooterPage022() throws Exception {

				FDP.gotofsubscribe();
				Thread.sleep(3000);
			}	
	    
	    @Test
			public void TC_FooterPage023() throws Exception {

				FDP.gotofFtwtlogo();
				Thread.sleep(3000);
			}	
	    @Test
			public void TC_FooterPage025() throws Exception {

				FDP.gotoFfbLogo();
				Thread.sleep(3000);
			}
	    @Test
			public void TC_FooterPage026() throws Exception {

				FDP.gotoFlinLogo();
				Thread.sleep(3000);
			}
	    @Test
			public void TC_FooterPage027() throws Exception {

				FDP.gotoFinstaLogo();
				Thread.sleep(3000);
			}

	    @Test
			public void TC_FooterPage028() throws Exception {

				FDP.gotoOurFUpArrow();
				Thread.sleep(3000);
			}
	    
	    @Test
			public void TC_FooterPage029() throws Exception {

				FDP.gotoFMinetextlink();
				Thread.sleep(3000);
			}
	    
	    
	    
	   

}
