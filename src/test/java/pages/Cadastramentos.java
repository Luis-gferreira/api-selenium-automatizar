package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cadastramentos {

	public void deveEfetuarCadastro(WebDriver getDriver) throws InterruptedException {
		getDriver.findElement(By.linkText("Cadastros")).click();
		getDriver.findElement(By.linkText("Clientes")).click();
		getDriver.findElement(By.linkText("INCLUIR")).click();
		getDriver.findElement(By.id("nomeUsuario")).sendKeys("Luis");
		getDriver.findElement(By.id("cpf")).sendKeys("00000000000");
		getDriver.findElement(By.id("dataNascimento")).sendKeys("01051990");
		getDriver.findElement(By.id("sexo")).click();
		getDriver.findElement(By.id("estadoCivil")).click();
		getDriver.findElement(By.id("nacionalidade")).sendKeys("Brasileiro");
		getDriver.findElement(By.id("email")).sendKeys("hshs@gmail.com");
		getDriver.findElement(By.id("telCelular")).sendKeys("00000000000");
		getDriver.findElement(By.id("telResidencial")).sendKeys("00000000000");
		getDriver.findElement(By.id("telComercial")).sendKeys("00000000000");
		getDriver.findElement(By.id("descricaoRamal")).sendKeys("0000");
		getDriver.findElement(By.id("nomeEmergencia")).sendKeys("Thami");
		getDriver.findElement(By.id("telEmergencial")).sendKeys("00000000000");
		getDriver.findElement(By.id("btnSalvar")).click();
		getDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[3]/button[1]")).click();

	}

}
