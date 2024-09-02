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
	public void registerValidData() {
		String name = excellibrary.readData("Registerdetails", 1, 0);
		String email = excellibrary.readData("Registerdetails", 1, 1);
		String Password = excellibrary.readData("Registerdetails", 1, 2);
		String mobileno = excellibrary.readData("Registerdetails", 1, 3);
		String feedback = excellibrary.readData("Registerdetails", 1, 5);

		// Waiting Statement
		javalibrary.pause(5000);

		// Provide Implicitly Wait
		webdriverlibrary.waitUntilElementFound();

		String exptitle = "LearningSelenium";
		String acttitle = webdriverlibrary.driver.getTitle();
		System.out.println(acttitle);

		// Step1:Verify the Register Page
		Assert.assertEquals(exptitle, acttitle, "Verified Register Page");

		// Create an Object For Register Page
		RegisterPage regpage = new RegisterPage(webdriverlibrary.driver);

		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getNametextfield().isDisplayed();

		// Step2:Verify The Element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTxtField Weblement -It Is Displayed");

		// Step3:Perform Action--Clear
		regpage.getNametextfield().clear();

		// Step4:Perform Action--Enter Name
		regpage.getNametextfield().sendKeys(name);

		// Step5:Perform Action--Enter Email
		regpage.getEmailtextfield().sendKeys(email);

		// Step6:Perform Action--Enter Password
		regpage.getPasswordtextfield().sendKeys(Password);

		// Step7:Perform Action--Enter MobileNo
		regpage.getMobiletextfield().sendKeys(mobileno);

		// Step8:Perform Action--Enter Feedback
		regpage.getFeedbacktextfield().sendKeys(feedback);

		Reporter.log("Register With Valid Data Sucess", true);
	}

}
