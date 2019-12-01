package test;

import static com.reuso.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import com.reuso.core.BaseTest;

import pages.LoginDoSistema;

/**
 * @author Luis.Ferreira
 * @since 21-08-2018
 */
public class LoginSistemaTest extends BaseTest {

	static LoginDoSistema page;

	@Before
	public void setUpBeforeClass() {
		page = new pages.LoginDoSistema();
	}

	@Test
	public void LoginDoSistema() {
		page.realizarLoginDoUsuario(getDriver());
	}

}
