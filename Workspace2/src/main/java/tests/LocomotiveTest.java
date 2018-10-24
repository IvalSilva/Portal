package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import core.DriverFactory;
import pages.LocomotivePage;
import pages.MenuPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocomotiveTest extends BaseTest{
	MenuPage menuPage = new MenuPage();
	LocomotivePage locomotivepage = new LocomotivePage();
	DriverFactory jse = new DriverFactory();

	/*
	 * The test case insert locomotive new;
	 */
	
	@Test
	public void test1_locomotive_NEW() throws InterruptedException {
		menuPage.acessarTelaLocomotive();
		
		jse.testescroll();
		
		locomotivepage.clicarBotaoNewLocomotive();
		
		locomotivepage.setNumero("2024");
		locomotivepage.selecionarCombo("CodigoModeloLocomotiva", "40"); /////// alterar essa parte
		locomotivepage.clicarBotaoSaveLococomotive();
		
	}

	/*
	 * Create test case
	 */
	
	//@Test
	public void test2_locomotive_DUPLICATE() {
		
	}

}
