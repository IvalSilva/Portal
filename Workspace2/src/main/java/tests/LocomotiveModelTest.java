package tests;

import org.junit.Test;
import core.BaseTest;
import core.DriverFactory;
import pages.LocomotiveModelPage;
import pages.MenuPage;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocomotiveModelTest extends BaseTest{
	MenuPage menuPage = new MenuPage();
	LocomotiveModelPage locomotivemodelPage = new LocomotiveModelPage();
	DriverFactory jse = new DriverFactory();
	
	
	
	/*
	 * The test case bellow insert new model locomotive
	 * 
	 */
	@Test
	public void test1_locomotivemodel_NEW() {
		menuPage.acessarTelaLocomotiveModel();
		
		jse.testescroll();

		locomotivemodelPage.clicarBotaoNewLocoModel();
		
		
		locomotivemodelPage.setCodigo("50");
		locomotivemodelPage.setPeso("1000");
		locomotivemodelPage.setComprimento("2000");
		locomotivemodelPage.setPolosTaco("120");
		locomotivemodelPage.setDiametroRoda("90");
		locomotivemodelPage.setPotenciaLowIdle("1000");
		locomotivemodelPage.setPotenciaIdle("2000");
		locomotivemodelPage.setPotenciaDinamico("3000");
		locomotivemodelPage.setPotenciaPonto1("100");
		locomotivemodelPage.setPotenciaPonto2("200");
		locomotivemodelPage.setPotenciaPonto3("300");
		locomotivemodelPage.setPotenciaPonto4("400");
		locomotivemodelPage.setPotenciaPonto5("500");
		locomotivemodelPage.setPotenciaPonto6("600");
		locomotivemodelPage.setPotenciaPonto7("700");
		locomotivemodelPage.setPotenciaPonto8("800");

		locomotivemodelPage.setConsumoLowIdle("1000");;
		locomotivemodelPage.setConsumoIdle("2000");
		locomotivemodelPage.setConsumoDinamico("3000");
		locomotivemodelPage.setConsumoPonto1("100");
		locomotivemodelPage.setConsumoPonto2("200");
		locomotivemodelPage.setConsumoPonto3("300");
		locomotivemodelPage.setConsumoPonto4("400");
		locomotivemodelPage.setConsumoPonto5("500");
		locomotivemodelPage.setConsumoPonto6("600");
		locomotivemodelPage.setConsumoPonto7("700");
		locomotivemodelPage.setConsumoPonto8("800");

		jse.testescroll();
		
		locomotivemodelPage.clicarBotaoSaveLocoModel();
		
		//Added successully!
		Assert.assertEquals("Added successully!", locomotivemodelPage.obterMensagemSucesso());
			
	}
	
	/*
	 * Update test case
	 */
	
	//@Test
	public void test2_locomotivemodel_DUPLICATE() {

		menuPage.acessarTelaLocomotiveModel();

		jse.testescroll();

		locomotivemodelPage.clicarBotaoNewLocoModel();


		locomotivemodelPage.setConsumoLowIdle("1000");;
		locomotivemodelPage.setConsumoIdle("2000");
		locomotivemodelPage.setConsumoDinamico("3000");
		locomotivemodelPage.setConsumoPonto1("100");
		locomotivemodelPage.setConsumoPonto2("200");
		locomotivemodelPage.setConsumoPonto3("300");
		locomotivemodelPage.setConsumoPonto4("400");
		locomotivemodelPage.setConsumoPonto5("500");
		locomotivemodelPage.setConsumoPonto6("600");
		locomotivemodelPage.setConsumoPonto7("700");
		locomotivemodelPage.setConsumoPonto8("800");
		
		locomotivemodelPage.setCodigo("50");
		locomotivemodelPage.setPeso("1000");
		locomotivemodelPage.setComprimento("2000");
		locomotivemodelPage.setPolosTaco("120");
		locomotivemodelPage.setDiametroRoda("90");
		locomotivemodelPage.setPotenciaLowIdle("1000");
		locomotivemodelPage.setPotenciaIdle("2000");
		locomotivemodelPage.setPotenciaDinamico("3000");
		locomotivemodelPage.setPotenciaPonto1("100");
		locomotivemodelPage.setPotenciaPonto2("200");
		locomotivemodelPage.setPotenciaPonto3("300");
		locomotivemodelPage.setPotenciaPonto4("400");
		locomotivemodelPage.setPotenciaPonto5("500");
		locomotivemodelPage.setPotenciaPonto6("600");
		locomotivemodelPage.setPotenciaPonto7("700");
		locomotivemodelPage.setPotenciaPonto8("800");

		jse.testescroll();
		
		locomotivemodelPage.clicarBotaoSaveLocoModel();
		
		Assert.assertEquals("The locomotive model code already exists.", locomotivemodelPage.obterMensagemSucesso());
	}



}
