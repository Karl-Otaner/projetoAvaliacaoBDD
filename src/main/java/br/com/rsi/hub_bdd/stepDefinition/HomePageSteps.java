package br.com.rsi.hub_bdd.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub_bdd.cucumber.TestContext;
import br.com.rsi.hub_bdd.pageObject.HomePage;
import cucumber.api.java.pt.Entao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class HomePageSteps {
	WebDriver driver;
	TestContext testContext;
	HomePage homepage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homepage = testContext.getPageObjectManager().getHomePage();
	
	}
	
	



	@Dado("^Escolhe um produto da tela$")
	public void escolhe_um_produto_da_tela() throws Throwable {

	
	}

	@Quando("^vai para a pagina do produto\\]$")
	public void vai_para_a_pagina_do_produto() throws Throwable {
	    
	}

	@Entao("^Valida o produto escolhido$")
	public void valida_o_produto_escolhido() throws Throwable {
	   
	}

	@Dado("^Escolhe um produto$")
	public void escolhe_um_produto() throws Throwable {
	    
	}

	@Quando("^vai para a pagina de outro produto\\]$")
	public void vai_para_a_pagina_de_outro_produto() throws Throwable {
	    
	}

	@Entao("^Valida esse erro$")
	public void valida_esse_erro() throws Throwable {
	   
	}
	
	
}
