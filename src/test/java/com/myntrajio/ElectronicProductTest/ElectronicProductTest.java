package com.myntrajio.ElectronicProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class ElectronicProductTest {

	@Test(groups = { "FT","RT"})
	public void addproduct() {
		Reporter.log("Electronic Product Added Sucess", true);
	}

	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("Electronic  Product Removed Sucess", true);
	}

	@Test(groups = { "ST","RT"})
	public void updateproduct() {
		Reporter.log("Electronic Product Updated Sucess", true);
	}
}
