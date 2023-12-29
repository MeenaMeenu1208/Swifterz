package Util;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
	
	public static ExtentReports getReportObject() {
		String path= System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Spice Jet Automation Project");
		reporter.config().setDocumentTitle("Spice Jet Reports");
		
		ExtentReports extent=new ExtentReports();
	//	extent.attachReporter(reporter);
	//	extent.setSystemInfo("Performed By : ", "Meena M - MINE");
		return extent;
	}


}
