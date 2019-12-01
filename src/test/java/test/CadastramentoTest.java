package test;

import static com.reuso.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import com.reuso.core.BaseTest;
import com.reuso.core.Login;

import pages.Cadastramentos;

/**
 * @author Luis.Ferreira
 * @since 20-08-2018
 */
public class CadastramentoTest extends BaseTest {
	
	static Login pagina;
	static Cadastramentos page;

	@Before
	public void inicial(){
		pagina = new Login();
		page = new Cadastramentos();
	}

	@Test
	public void deveEfetuarCadastro() throws InterruptedException {
		pagina.deveLogar(getDriver());
		page.deveEfetuarCadastro(getDriver());

	}

}
