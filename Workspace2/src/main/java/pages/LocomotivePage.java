package pages;

import core.BasePage;

public class LocomotivePage extends BasePage{
	
	public void clicarBotaoNewLocomotive(){
		clicarBotaoXpathClass("btn btn-primary operation-button");
	}

	public void setNumero (String id){
		escrever("Numero", id);
		
	}
	
	public void clicarBotaoSaveLococomotive(){
		clicarBotaoPorTextoXpath("btn btn-primary");
	}
	
//	public void setCombo(String valor) {
//		selecionarCombo("CodigoModeloLocomotiva", valor);
//	}

}
