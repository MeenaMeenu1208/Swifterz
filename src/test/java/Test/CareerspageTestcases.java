package Test;

import org.testng.annotations.Test;

import Base.baseClass;
import Pages.CareersPage;

public class CareerspageTestcases extends baseClass {
	
	CareersPage CP = new CareersPage();
	
	@Test
	public void CareersPage_TC001() {
		CP.gotoHVACDesignbtn();
		titleAssertion("Job - Swifterz Creative Services");
	}
	
	@Test
	public void CareersPage_TC002() {
		CP.gotoPHEandFFDesignbtn();
		titleAssertion("Job - Swifterz Creative Services");
	}
	
	@Test
	public void CareersPage_TC003() {
		CP.gotoElectricalDesign();
		titleAssertion("Job - Swifterz Creative Services");
	}
    @Test
	public void CareersPage_TC004() {
		CP.gotoBIMModeler();
		titleAssertion("Job - Swifterz Creative Services");
	}
    @Test
	public void CareersPage_TC005() {
		CP.gotoBIMTrainer();
		titleAssertion("Job - Swifterz Creative Services");
	}

	

}
