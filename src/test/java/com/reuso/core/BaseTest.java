package com.reuso.core;

import static com.reuso.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Before;


/**
 * @author Luis.Ferreira
 * @since 30-07-2018
 * Classe utilizada para iniciar o plugin do navegador firefox.
 */
public class BaseTest {

	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		getDriver().get("http://seusite.com.br");

	}

	@After
	public void finalizaTudo() {
		TestReport testeReport = new TestReport();
		testeReport.report();
		DriverFactory.killDriver();
	}
}
