package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceCreat;

public class TC_001CreatSalesForce extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		filename = "CreatSalesForce";

	}
	
	
	
	
    @Test(dataProvider = "fetchdata")
	public void runCreatSalesForce(String pName,String value ) throws InterruptedException {
		new SalesForceCreat(driver)
		.creatsalesforce(pName,value);
		
		

	}
}
