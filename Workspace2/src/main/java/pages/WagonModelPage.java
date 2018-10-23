package pages;

import core.BasePage;

public class WagonModelPage extends BasePage{
	
	public void clicarBotaoNewWagonModel(){
		clicarBotaoXpathClass("btn btn-primary operation-button");
	}
	
	public void setCodigo(String codigo) {
		escrever("Codigo", codigo);
	}
	
	public void setComprimento(String comprimento) {
		escrever("Comprimento", comprimento);
	}
	
	public void setPesoTara(String pesotara) {
		escrever("PesoTara", pesotara);
	}

	public void clicarBotaoSaveWagonModel(){
		clicarBotaoPorTextoXpath("btn btn-primary");
	}
	
	
}
