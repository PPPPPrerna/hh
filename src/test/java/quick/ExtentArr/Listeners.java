package quick.ExtentArr;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import quick.ExtentArr.ExtentRport;

public class Listeners  implements ITestListener{
	
	com.aventstack.extentreports.ExtentReports extent = ExtentRport.show();
	
	ThreadLocal<ExtentTest> local = new ThreadLocal<ExtentTest>();
	ExtentTest test;
	
	
	
	
	
	
					
	

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	
		extent.flush();
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		//test=extent.createTest(arg0.getMethod().getMethodName());
		
		test = extent.createTest(arg0.getMethod().getMethodName());
		local.set(test);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		local.get().log(Status.PASS, "Test Passed");
		
	}
	
	

}
