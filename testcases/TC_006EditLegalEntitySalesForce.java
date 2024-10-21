package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceEdit;
import salesforce_application.SalesForceLeaglEntityEdit;

public class TC_006EditLegalEntitySalesForce extends BaseClass {
	
	
	@Test
	public void runLeaglEntityEdit() throws InterruptedException {
		new SalesForceLeaglEntityEdit(driver)
		.editLegalEntity();

	}
	

}
