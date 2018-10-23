package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.MenuPage;
import pages.WagonModelPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WagonModelTest extends BaseTest{
	MenuPage menuPage = new MenuPage();
	WagonModelPage wagonmodepage = new WagonModelPage();

	
	@Test
	public void test1_wagonmodel_NEW() throws InterruptedException {
		
		menuPage.acessarTelaWagonModel();
		
		wagonmodepage.clicarBotaoNewWagonModel();
		
		wagonmodepage.setCodigo("1000");
		wagonmodepage.setComprimento("20");
		wagonmodepage.setPesoTara("200");
		
		wagonmodepage.clicarBotaoSaveWagonModel();
		
	}

	//@Test
	public void test2_wagonmodel_DUPLICATE() {
		
	}

}
