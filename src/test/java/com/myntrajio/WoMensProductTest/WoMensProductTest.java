package com.myntrajio.WoMensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class WoMensProductTest {
	@Test(groups = { "FT","RT"})
	public void addproduct() {
		Reporter.log("Womens Product Added Sucess", true);
	}

	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log(" Womens Product Removed Sucess", true);
	}

	@Test(groups = { "ST","RT"})
	public void updateproduct() {
		Reporter.log(" Womens Product Updated Sucess", true);
	}

}
