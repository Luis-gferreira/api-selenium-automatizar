package com.reuso.core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Luis.Ferreira
 * @since 10-08-2018
 * Classe factory utilizada para criar nova instancia do FirefoxDriver
 */
public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {}

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
