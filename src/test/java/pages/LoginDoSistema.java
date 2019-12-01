package pages;

import static com.reuso.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDoSistema {

	public void realizarLoginDoUsuario(WebDriver getDriver) {

		WebElement email = getDriver().findElement(By.id("inputEmail"));
		email.sendKeys("seuemail@gmail.com");

		WebElement senha = getDriver().findElement(By.id("inputPassword"));
		senha.sendKeys("suasenha");
		Assert.assertEquals("suasenha", getDriver().findElement(By.id("inputPassword")).getAttribute("value"));

		WebElement botaoEntrar = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/form/button"));
		botaoEntrar.click();

	}
}
