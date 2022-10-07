package config.properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentreportGenrator {
	
	public static ExtentReports extent;
	
	public static ExtentReports GetReport() {
		
		
		String rpath="C:\\Users\\shubh\\eclipse-workspace\\framework_sample\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(rpath);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("facebook report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("project name", "Facebook");
		extent.setSystemInfo("module name", "loginpage");
		extent.setSystemInfo("BrowserName1", "Chrome");
		extent.setSystemInfo("BrowserName2", "Edge");
		extent.setSystemInfo("SeleniumVersion", "3.141.59");
		extent.setSystemInfo("QAName", "Shubham");
		extent.setSystemInfo("Team lead", "Govind mule");
		
		return extent;
	}



}
