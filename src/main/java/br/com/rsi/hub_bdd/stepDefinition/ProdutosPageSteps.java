package br.com.rsi.hub_bdd.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub_bdd.cucumber.TestContext;
import br.com.rsi.hub_bdd.manager.PageObjectManager;
import br.com.rsi.hub_bdd.pageObject.HomePage;
import br.com.rsi.hub_bdd.pageObject.ProductoLupaPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ProdutosPageSteps {
	WebDriver driver;

	PageObjectManager gerenciadorPagina;
	HomePage homePage;
	TestContext testContext;
	ProductoLupaPage productoLupaPage;
	public ProdutosPageSteps(TestContext context) {
		testContext = context;
		productoLupaPage = testContext.getPageObjectManager().getBuscaLupa();
	}
	
	
	@Quando("^escolha o produto pela imagem$")
	public void escolha_o_produto_pela_imagem() throws Throwable {
//	productListingPage.select_Product(0);
//	productListingPage.clickOn_AddToCart(); 
	 
	}

	@Quando("^clique no mouse escolhido$")
	public void clique_no_mouse_escolhido() throws Throwable {
	   
	}

	@Entao("^vai para a pagina do produto escolhido$")
	public void vai_para_a_pagina_do_produto_escolhido() throws Throwable {
	    
	}

	@Quando("^o Usuario clicar para ver detalhes do laptop$")
	public void o_Usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {


	}

	@Entao("^Será exibida a página de outro laptop$")
	public void será_exibida_a_página_de_outro_laptop() throws Throwable {


	}
	
	@Dado("^O usuário está na página inicial$")
	public void o_usuário_está_na_página_inicial() throws Throwable {


	}

	@Quando("^o usuário clica na barra de pesquisa$")
	public void o_usuário_clica_na_barra_de_pesquisa() throws Throwable {

;
	}

	@Quando("^digitar o nome do produto Valido$")
	public void digitar_o_nome_do_produto_Valido() throws Throwable {


	}

	@Então("^será direcionado para a página produtos$")
	public void será_direcionado_para_a_página_produtos() throws Throwable {


	}

	@Quando("^digitar o nome do produto invalido$")
	public void digitar_o_nome_do_produto_invalido() throws Throwable {


	}

	@Então("^Valida a mensage que o produto não existe$")
	public void valida_a_mensage_que_o_produto_não_existe() throws Throwable {


	}



}
