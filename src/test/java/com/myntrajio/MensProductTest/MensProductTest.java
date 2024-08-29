package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class MensProductTest {
	@Test(groups = { "FT","RT"})
	public void addproduct() {
		Reporter.log("MensProduct Added Sucess", true);
	}

	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log(" MensProduct Removed Sucess", true);
	}

	@Test(groups = { "ST","RT"})
	public void updateproduct() {
		Reporter.log("MensProduct Updated Sucess", true);
	}

}
