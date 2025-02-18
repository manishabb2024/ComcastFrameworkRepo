package com.clientName.vtiger.ListenerUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.generic.baseUtility.BaseClass;


public class ListenerImplementation implements ITestListener,ISuiteListener,IRetryAnalyzer {
public	ExtentReports report;	
	public void onStart(ISuite suite)
	{
		System.out.println("Report Configuration like bs");
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
 		spark.config().setDocumentTitle("CRM Test Suite Results");
 		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
	}
	public void onFinish(ISuite suite)
	{ 
		System.out.println("Report backup like after suite");
		report.flush();
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("------like before----result.getMethod().getMethodName()---start---");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("---------PASSED----result.getMethod().getMethodName()----END--");
	}
	public void onTestFailure(ITestResult result)
	{
		String testName=result.getMethod().getMethodName();
		//String testNAme=result.BaseClass.sdriver;
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        // Save the screenshot to a file
        File destination = new File("./screenshot/"+testName+".png");
        try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
}

}
