package br.com.rsi.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;

public class Gerenciador_Pagina {

	private WebDriver driver;
	private PaginaInicial homePage;
	private Dados_Cadastro dadosCadastro;
	private Busca_Produto buscaProduto;

	public Gerenciador_Pagina(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaInicial getHomePage() {
		return (homePage == null) ? homePage = new PaginaInicial(driver) : homePage;
	}

//	public Dados_Cadastro getDadosCadastro() {
//		return (dadosCadastro == null) ? dadosCadastro = new Dados_Cadastro(driver) : dadosCadastro;
//	}

	public Busca_Produto getBuscaProduto() {
		return (buscaProduto == null) ? buscaProduto = new Busca_Produto(driver) : buscaProduto;

	}
}
