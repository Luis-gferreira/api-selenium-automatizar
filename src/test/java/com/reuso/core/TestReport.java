package com.reuso.core;

import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author Luis.Ferreira
 * @since 10-01-2018
 */
public class TestReport {

	@Test
	public void report() {
		System.out.println("Navega��o Do Site");

		ExtentHtmlReporter Automation = new ExtentHtmlReporter("./Reports/Tgestor_Automatizar.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(Automation);

		ExtentTest logger = extent.createTest("Navega��oTest");

		logger.log(Status.INFO, "Navega��o Do Site");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
	}

}
