package com.Test;

import java.io.File;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.jbk_login_page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class jbk_login_test {
	
	WebDriver driver;	
    jbk_login_page lp = null;
    static ExtentTest test;
    static ExtentReports report;
    
    
    private String capture(WebDriver driver) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		
		//return null;
		return errflpath;
	}
    
    @BeforeClass
    public static void startTest()
    {
    report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResultsJBK.html",true);
    test = report.startTest("ExtentDemo01");
    }
    
    
	@Test	
	public void jbk_launch() throws Exception {	
	driver=	TestBase.jbk_lauch_url();
	lp = new jbk_login_page(driver);
	lp.valid_credentials();
	
	if(driver.getTitle().equals("JavaByKiran | Dashboar"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
		
	{
	test.log(LogStatus.FAIL, "Test Failed");
	test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
	}
		
	}
	
	
	@AfterClass
	
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}

}
