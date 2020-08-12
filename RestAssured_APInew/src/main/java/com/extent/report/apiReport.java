package com.extent.report;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class apiReport {
	
	public static ExtentReports reports;
	public static ExtentTest logger;

	public void createReport() {
		String sDate=new SimpleDateFormat("'sample_'yyyyMMddHHmm''").format(new Date());
		reports=new ExtentReports("../RestAssured_APInew/ExtentReports/report_"+sDate+".html");
	}
	
	public void createTestCase(String testCaeName) {
		logger=reports.startTest(testCaeName);
		
	}
	public void endTestCase() {
		reports.endTest(logger);

	}
	public void endReport() {
		reports.flush();
		System.out.println("report genarated");
	}
	
//	public static void main(String[] args) {
//		 reports=new ExtentReports("../RestAssured_APInew/ExtentReports/samplereport.html");
//		 
//		logger=reports.startTest("Demo reports started");
//		logger.log(LogStatus.INFO, "Enter username and password");
//		logger.log(LogStatus.INFO, "clicked on submit");
//		logger.log(LogStatus.PASS, "logged in successfully");
//		logger.log(LogStatus.FAIL, "Next page not loaded");
//		reports.endTest(logger);
//		reports.flush();
//		System.out.println("report genarated");
//	}

}
