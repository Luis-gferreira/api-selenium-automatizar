package test;

import static com.reuso.core.DriverFactory.getDriver;

import org.junit.BeforeClass;
import org.junit.Test;

import com.reuso.core.BaseTest;
import com.reuso.core.Login;

import pages.NavegacaoDoSite;

/**
 * @author Luis.Ferreira
 * @since 25-08-2018
 */
public class NavegacaoSiteTest extends BaseTest {
	static Login pagina;
	static NavegacaoDoSite page;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pagina = new Login();
		page = new NavegacaoDoSite();
	}

	@Test
	public void NavegacaoSite() throws InterruptedException {
		pagina.deveLogar(getDriver());
		page.deveClicarEmAgendamento(getDriver());
		page.deveClicarEmCadastros(getDriver());
		page.deveClicarEmFinanceiro(getDriver());
		page.voltarAoInicio(getDriver());
	}

}
