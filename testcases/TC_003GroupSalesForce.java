package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceGroup;

public class TC_003GroupSalesForce extends BaseClass{


	@Test	
	public void runSalesForceGroup() throws InterruptedException {
		new SalesForceGroup(driver)
		.salesForceGroup();

	}
}
