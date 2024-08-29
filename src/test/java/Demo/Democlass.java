package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Democlass {
	@Test
	public void democlass() {
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");

		spark.config().setDocumentTitle("Title Of Document");
		spark.config().setReportName("Report Name");
		spark.config().setTheme(Theme.DARK);

		// Add Environment Information
		ExtentReports report = new ExtentReports();

		report.attachReporter(spark);
		report.setSystemInfo("OS:", "windows 11 Pro");
		report.setSystemInfo("Browser:", "Chrome 127.00 ");

		// Create Test and Logs for Steps
		ExtentTest test = report.createTest("TestName-ClassName");

		test.log(Status.INFO, "Login To App Success");
		test.log(Status.INFO, "Navigate To App Success");
		test.log(Status.INFO, "Create Product  Success");

		if ("Harry" == "Harry") 
		{
			test.log(Status.PASS, "Pass");
		}
		else {

			test.log(Status.FAIL, "Fail");
		}

		// Flush The Report
		report.flush();

	}

}
