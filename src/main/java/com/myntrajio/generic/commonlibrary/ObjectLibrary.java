package com.myntrajio.generic.commonlibrary;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyfile;
import com.myntrajio.generic.webdriverlibrary.WebDriverLibrary;

public class ObjectLibrary  implements FrameworkConstant{
	public ReadExcelFile excellibrary;
	public JavaLibrary javalibrary;
	public ReadPropertyfile propertyfilelibrary;
	public WebDriverLibrary webdriverlibrary;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	public void createObject() {
		excellibrary = new ReadExcelFile();
		javalibrary = new JavaLibrary();
		propertyfilelibrary = new ReadPropertyfile();
		webdriverlibrary = new WebDriverLibrary();

		// Create the SparkReport
		spark = new ExtentSparkReporter(reportpath);

		// Create the Extent Report
		report = new ExtentReports();

	}
}
