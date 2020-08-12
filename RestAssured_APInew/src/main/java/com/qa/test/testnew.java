package com.qa.test;

import com.extent.report.apiReport;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testnew extends apiReport{

	public static apiReport re;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		re=new apiReport();
		re.createReport();
		re.createTestCase("API test Started");
		logger.log(LogStatus.INFO, "POST API given");
	String url="https://stg-api.cowrks.team/profile-service/v2/auth/profile_exist";
		
		RestAssured.baseURI=url;
		logger.log(LogStatus.INFO, "POST API is:"+url);
		Response res=RestAssured.given().contentType("application/json").body("{\n" + 
				"    \"identifier\": \"ravi.kone@cowrks.com\",\n" + 
				"    \"send_activation_link\":false,\n" + 
				"    \"src\":\"connect_mobile\"\n" + 
				"}").post();
		logger.log(LogStatus.PASS, "POST API triggered");
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
		re.endTestCase();
		re.endReport();

	}

}
