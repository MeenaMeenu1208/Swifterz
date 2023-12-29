package Test;

import Base.baseClass;
import Pages.JobPages;

public class JobTestCases extends baseClass {
	
	JobPages JP = new JobPages();
	
	
	public void JobTestCases_TC001(String name,String email, String contact){
		JP.gotoHVACDesignjob(name,email,contact);
		
	}
	public void JobTestCases_TC002(String name,String email, String contact){
		JP.gotoPHEandFFDesignjob(name,email,contact);
		
	}
	public void JobTestCases_TC003(String name,String email, String contact){
		JP.gotoElectricalDesignjob(name,email,contact);
		
	}
	public void JobTestCases_TC004(String name,String email, String contact){
		JP.gotoBIMModelerjob(name,email,contact);
		
	}
	public void JobTestCases_TC005(String name,String email, String contact){
		JP.gotoBIMTrainerjob(name, email,contact);
		
	}

	

}
