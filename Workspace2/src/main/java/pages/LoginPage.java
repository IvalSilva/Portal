package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;


public class LoginPage extends BasePage{
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://192.168.1.165/Home/Login?ReturnUrl=%2f");
	}
	
	public void setEmail(String email) {
		escrever("UserName", email);
	}
	
	public void setSenha(String senha) {
		escrever("Password", senha);
	}
	
	public void entrar(){
		clicarBotaoPorTexto("Log In");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}
