package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceEdit;

public class TC_002EditSalesForce extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		filename = "EditSalesForce";

	}
	
	@Test(dataProvider ="fetchdata")
	public void runEditSalesForce(String fName,String desc) throws InterruptedException {
		new SalesForceEdit(driver)
		.editSalesForce(fName,desc);

	}
}
