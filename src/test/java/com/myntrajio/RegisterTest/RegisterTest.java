package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class RegisterTest extends BaseTest {
	
	
	
	@Test
	public void registerValidData() 
	{
		
		javalibrary.pause(5000);

		// Step1:Verify the Register Page
		Assert.assertEquals("title", "title","Verified Register Page");

		// Step2:Verify The Element
		Assert.assertEquals("element", "element","Verified Weblement");

		// Create an Object For Register Page
		RegisterPage regpage = new RegisterPage(webdriverlibrary.driver);

		// Step3:Perform Action--Clear
		regpage.getNametextfield().clear();
		
		// Step4:Perform Action--Enter Email
		regpage.getNametextfield().sendKeys("Admin123");
	
		// Step5:Perform Action--Enter Email
		regpage.getEmailtextfield().sendKeys("admin123@gmail.com");

		// Step6:Perform Action--Enter Password
		regpage.getPasswordtextfield().sendKeys("admin123@#");

		// Step7:Perform Action--Enter MobileNo
		regpage.getMobiletextfield().sendKeys("9876543210");

		Reporter.log("Register With Valid Data Sucess", true);
	}

}
