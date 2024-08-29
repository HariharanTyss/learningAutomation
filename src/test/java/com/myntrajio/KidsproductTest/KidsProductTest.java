package com.myntrajio.KidsproductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class KidsProductTest {

	@Test(groups = { "FT","RT"})
	public void addproduct() {
		Reporter.log("KidsProduct Added Sucess", true);
	}

	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("KidsProduct Removed Sucess", true);
	}

	@Test(groups = { "ST","RT"})
	public void updateproduct() {
		Reporter.log("KidsProduct Updated Sucess", true);
	}

}
