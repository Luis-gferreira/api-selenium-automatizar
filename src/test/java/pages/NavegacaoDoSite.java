package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavegacaoDoSite {

	public void deveClicarEmAgendamento(WebDriver getDriver) {
		getDriver.findElement(By.linkText("Agendamento")).click();
		getDriver.findElement(By.linkText("Agenda de clientes")).click();
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(3) .d-none")).click();
		getDriver.findElement(By.linkText("Consultar Agendamentos")).click();

	}

	public void deveClicarEmCadastros(WebDriver getDriver) {
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(4) .d-none")).click();
		getDriver.findElement(By.linkText("Clientes")).click();
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(4) .d-none")).click();
		getDriver.findElement(By.linkText("Funcionários")).click();
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(4) .d-none")).click();
		getDriver.findElement(By.linkText("Serviços")).click();
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(4) .d-none")).click();
		getDriver.findElement(By.linkText("Produtos")).click();
	}

	public void deveClicarEmFinanceiro(WebDriver getDriver) {
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(5) .d-none")).click();
		getDriver.findElement(By.linkText("Fechamento")).click();
	}

	public void voltarAoInicio(WebDriver getDriver) {
		getDriver.findElement(By.cssSelector(".nav-item:nth-child(2) .d-none")).click();
		getDriver.findElement(By.linkText("Dashboard")).click();
	}
}
