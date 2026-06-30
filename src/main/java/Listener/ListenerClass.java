package Listener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.LocalComplexTypeImpl;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.QAFoxLiveAutomationBaseClass;

public class ListenerClass extends QAFoxLiveAutomationBaseClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		LocalDateTime lodate=LocalDateTime.now();
		String date=lodate.toString().replace(":","-");
		Reporter.log("onTestFailure",true);
		TakesScreenshot shot=(TakesScreenshot)(driver);
		File from=shot.getScreenshotAs(OutputType.FILE);
		File to=new File(".\\src\\test\\resources\\Screenshot\\FailedScreenshot"+date+".png");
		
		try 
		{
		   FileHandler.copy(from, to);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
	
		Reporter.log("onFinish",true);
	}

}
