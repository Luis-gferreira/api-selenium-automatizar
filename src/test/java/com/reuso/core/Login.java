package com.reuso.core;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Luis.Ferreira
 * @since 10-01-2018
 */
public class Login extends BaseTest {

	@Test
	public void deveLogar(WebDriver getDriver) throws InterruptedException {

		getDriver.findElement(By.id("inputEmail")).sendKeys("seuusuario");
		getDriver.findElement(By.id("inputPassword")).sendKeys("suasenha");
		getDriver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
		getDriver.navigate().to("http://seusite");
	}
}
