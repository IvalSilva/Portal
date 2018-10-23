package pages;

import core.BasePage;

public class MenuPage extends BasePage {
	
	// ======================= Menu Rolling Stock ==================================
	
	public void acessarTelaLocomotiveModel() {
		clicarLink("Rolling Stock");
		clicarLink("Locomotive Model");
	}
	
	public void acessarTelaLocomotive() throws InterruptedException {
		clicarLink("Rolling Stock");
		Thread.sleep(2000);
		clicarLink("Locomotive");
	}

	public void acessarTelaWagonModel() throws InterruptedException {
		Thread.sleep(2000);
		clicarLink("Rolling Stock");
		Thread.sleep(2000);
		clicarLink("Wagon Model");
	}
	
	public void acessarTelaWagon() {
		clicarLink("Rolling Stock");
		clicarLink("Wagon");
	}
	
	// ================================================

}
