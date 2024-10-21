package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceGroupEdit;

public class TC_004GroupEditSalesForce extends BaseClass{
	
	
	@Test
	public void runEditSalesForceGroup() throws InterruptedException {
		new SalesForceGroupEdit(driver)
		.editSalesForceGroup();

	}
}
