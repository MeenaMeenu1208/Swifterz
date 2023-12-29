package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class CareersPage extends baseClass {
	
	@FindBy(xpath="//a [text()=\"Job Details\"]")
	WebElement HVACDesignbtn;
	@FindBy(xpath="//a [@href=\"job_details.php?id=26\"]")
	WebElement PHEandFFDesignbtn;
	@FindBy(xpath="//a [@href=\"job_details.php?id=27\"]")
	WebElement ElectricalDesign;
	@FindBy(xpath="//a [@href=\"job_details.php?id=28\"]")
	WebElement BIMModeler;
	@FindBy(xpath="//a [@href=\"job_details.php?id=29\"]")
	WebElement BIMTrainer;

	public CareersPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void gotoHVACDesignbtn() {
		clickOn(HVACDesignbtn);
	}
	public void gotoPHEandFFDesignbtn() {
		clickOn(PHEandFFDesignbtn);
	}

	public void gotoElectricalDesign() {
		clickOn(ElectricalDesign);
	}

	public void gotoBIMModeler() {
		clickOn(BIMTrainer);
	}

	public void gotoBIMTrainer() {
		clickOn(BIMTrainer);
	}


}
