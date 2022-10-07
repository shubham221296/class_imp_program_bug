package config.properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utility.Baseclasss;

public class Listners extends Baseclasss implements ITestListener {
	
	ExtentReports extent=ExtentreportGenrator.GetReport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {
		Liabrary.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Liabrary.test);
		}
	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case pass");
	}
	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test case Fail");
	}
	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test case skkip");
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	public static void Get_Capture() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.BASE64);		
	}
}
