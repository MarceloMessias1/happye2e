package Steps;

import java.io.IOException;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos metodos = new Metodos();

	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String string) {
		metodos.abrirWebSite(string, string);

	}

/*	@When("Clicar cookies")
	public void clicar_cookies() throws IOException {
		metodos.clicar_cookies("//*[@id=\"cookies\"]/div/div[2]/a[1]");
		// TODO: handle exception
	}

	@When("Entre no canal solicitacoes")
	public void entre_no_canal_solicitacoes() throws InterruptedException {

		//metodos.entre_no_canal_solicitacoes("//*[@id=\"sctCartao\"]/div/div[3]/p[1]/a");
		Thread.sleep(2000);
}*/

	@When("Clico em sugestoes")
	public void clico_em_sugestoes() {
		metodos.clico_em_sugestoes("//*[@id='rblMotivo_sugestao']");
	}

	@When("Preencho campos")
	public void preencho_campos() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("envio solicitacao")
	public void envio_solicitacao() throws InterruptedException, IOException {
		metodos.fecharWebsite();
		Thread.sleep(4000);
		metodos.salvascreenShot("solicita��o");
		metodos.fecharWebsite();
	}
}