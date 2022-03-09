package RenegociarDividas;

import Metodos.Metodos;
import Renegociar.MetodosDividas;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDividas {
	MetodosDividas metodos = new MetodosDividas();

	@When("Clicar renegociar divida")
	public void clicar_renegociar_divida() {
		metodos.clicar_renegociar_divida("//*[@id=\\\"ctl00_home\\\"]/div[3]/div[2]/a[1]");
		metodos.clicar_renegociar_divida("//*[@class='btn-azul-outline']");
	}

	@When("preencher cpf")
	public void preencher_cpf() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("valido informa??o")
	public void valido_informa_o() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
