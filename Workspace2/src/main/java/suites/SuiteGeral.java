package suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import pages.LoginPage;
import tests.LocomotiveModelTest;
import tests.LocomotiveTest;
import tests.WagonModelTest;
import tests.WagonTest;


@RunWith(Suite.class)
@SuiteClasses({
	LocomotiveModelTest.class,
	LocomotiveTest.class,
	WagonModelTest.class,
	//WagonTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("admin@qa");
		page.setSenha("123456");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}
