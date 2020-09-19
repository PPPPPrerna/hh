package quick.ExtentArr;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRport {
	
	public static ExtentReports show() {
	String path = System.getProperty("user.dir")+"\\reports"+"\\index.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
	reporter.config().setDocumentTitle("Prerna");
	reporter.config().setReportName("Prerna Pandey");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	return extent;
	

}
}
