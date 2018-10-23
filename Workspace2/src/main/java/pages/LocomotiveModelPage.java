package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class LocomotiveModelPage extends BasePage {

	

	public void clicarBotaoNewLocoModel(){
		clicarBotaoXpathClass("btn btn-primary operation-button");
	}

	
	public void setCodigo(String codigo) {
		escrever("Codigo", codigo);
	}

	public void setPeso(String peso) {
		escrever("Peso", peso);
	}

	public void setComprimento(String comprimento) {
		escrever("Comprimento", comprimento);
	}

	public void setPolosTaco(String polostaco) {
		escrever("PolosTaco", polostaco);
	}

	public void setDiametroRoda(String diamentroroda) {
		escrever("DiametroRoda", diamentroroda);
	}

	public void setPotenciaLowIdle(String potencialowidle) {
		escrever("PotenciaLowIdle", potencialowidle);
	}

	public void setPotenciaIdle(String potenciaidle) {
		escrever("PotenciaIdle", potenciaidle);
	}

	public void setPotenciaDinamico(String potenciadinamico) {
		escrever("PotenciaDinamico", potenciadinamico);
	}

	public void setPotenciaPonto1(String potenciaponto1) {
		escrever("PotenciaPonto1", potenciaponto1);
	}

	public void setPotenciaPonto2(String potenciaponto2) {
		escrever("PotenciaPonto2", potenciaponto2);
	}

	public void setPotenciaPonto3(String potenciaponto3) {
		escrever("PotenciaPonto3", potenciaponto3);
	}

	public void setPotenciaPonto4(String potenciaponto4) {
		escrever("PotenciaPonto4", potenciaponto4);
	}

	public void setPotenciaPonto5(String potenciaponto5) {
		escrever("PotenciaPonto5", potenciaponto5);
	}

	public void setPotenciaPonto6(String potenciaponto6) {
		escrever("PotenciaPonto6", potenciaponto6);
	}

	public void setPotenciaPonto7(String potenciaponto7) {
		escrever("PotenciaPonto7", potenciaponto7);
	}

	public void setPotenciaPonto8(String potenciaponto8) {
		escrever("PotenciaPonto8", potenciaponto8);
	}

	public void setConsumoLowIdle(String consumolowidle) {
		escrever("ConsumoLowIdle", consumolowidle);
	}

	public void setConsumoIdle(String consumoidle) {
		escrever("ConsumoIdle", consumoidle);
	}

	public void setConsumoDinamico(String consumodinamico) {
		escrever("ConsumoDinamico", consumodinamico);
	}

	public void setConsumoPonto1(String consumoponto1) {
		escrever("ConsumoPonto1", consumoponto1);
	}

	public void setConsumoPonto2(String consumoponto2) {
		escrever("ConsumoPonto2", consumoponto2);
	}

	public void setConsumoPonto3(String consumoponto3) {
		escrever("ConsumoPonto3", consumoponto3);
	}

	public void setConsumoPonto4(String consumoponto4) {
		escrever("ConsumoPonto4", consumoponto4);
	}

	public void setConsumoPonto5(String consumoponto5) {
		escrever("ConsumoPonto5", consumoponto5);
	}

	public void setConsumoPonto6(String consumoponto6) {
		escrever("ConsumoPonto6", consumoponto6);
	}

	public void setConsumoPonto7(String consumoponto7) {
		escrever("ConsumoPonto7", consumoponto7);
	}

	public void setConsumoPonto8(String consumoponto8) {
		escrever("ConsumoPonto8", consumoponto8);
	}
	
	
	public void clicarBotaoSaveLocoModel(){
		clicarBotaoPorTextoXpath("btn btn-primary");
	}
	
	public String obterMensagemSucesso(){
		return obterTexto(By.xpath("/html/body/div/div/div[3]/fieldset/div[1]/ul/li"));
	}

	


}
