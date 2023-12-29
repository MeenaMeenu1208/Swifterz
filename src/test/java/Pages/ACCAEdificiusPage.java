package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Table.Cell;

import Base.baseClass;

public class ACCAEdificiusPage extends baseClass  {
	@FindBy(name="name")
	WebElement PName;
	@FindBy(name="email")
	WebElement Pemail;
	@FindBy(name="contact")
	WebElement PphoneNo;
	@FindBy(name="address")
	WebElement Paddress;
	@FindBy(className="submit-btn2")
	WebElement Psignupbtn;
	
	public ACCAEdificiusPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void gotoACCAEdificiusPage(String pname, String pemail, String pphoneNo, String pmessage ) {
		clickOn(PName);
		type(PName, pname);
		type(Pemail, pemail);
		type(PphoneNo, pphoneNo);
		type(PName, pmessage);
		clickOn(Psignupbtn);
		
		
		/*public void gotoACCAEdificiusPage(String pname, String pemail, String pphoneNo, String pmessage) {
		    // Your existing code to navigate to the page

		    // Assuming pname is a numeric value in the Excel sheet
		    Cell cell = row.getCell(columnIndexOfPname); // Adjust column index accordingly

		    switch (cell.getCellType()) {
		        case STRING:
		            String stringValue = cell.getStringCellValue();
		            // Use stringValue in your logic
		            break;
		        case NUMERIC:
		            double numericValue = cell.getNumericCellValue();
		            String numericString = String.valueOf(numericValue);
		            // Use numericString in your logic
		            break;
		        default:
		            // Handle other cell types if needed
		    }

		    // Your existing code to enter data on the page
		}*/
		
	}
	

	

}
