package Test;

import org.testng.annotations.BeforeTest;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.ACCAEdificiusPage;

public class ACCAEdificiusPageTestCases extends baseClass {

    ACCAEdificiusPage AFP = new ACCAEdificiusPage();

    @BeforeTest
    public void declareSheetName() {
        sheetName = "ACCAEdificius";
    }

    @Test(dataProvider = "SwifterzExcelData")
    public void TC_FooterPage021(String pname, String pemail, String pphoneNo, String pmessage) throws Exception {
        AFP.gotoACCAEdificiusPage(pname, pemail, pphoneNo, pmessage);
    }
    

}
