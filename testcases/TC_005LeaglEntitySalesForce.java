package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import salesforce_application.SalesForceLeagalEntity;

public class TC_005LeaglEntitySalesForce extends BaseClass {


	@Test
	public void runLeaglEntity() throws InterruptedException {
		new SalesForceLeagalEntity(driver)
		.LeaglEntity();

	}
}
