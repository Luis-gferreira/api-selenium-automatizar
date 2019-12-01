package br.com.Suits;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.CadastramentoTest;
import test.LoginSistemaTest;
import test.NavegacaoSiteTest;

/**
 * @author Luis.Ferreira
 * @since 30-07-2018
 * Classe inicial dos teste de selenium
 */
@RunWith(Suite.class)
@SuiteClasses({
	LoginSistemaTest.class,
	NavegacaoSiteTest.class,
	CadastramentoTest.class
})
public class SuitTest {

}
