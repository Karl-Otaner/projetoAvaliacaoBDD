package br.com.rsi.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub_bdd.pageObject.BuscaProdutoTela;
import br.com.rsi.hub_bdd.pageObject.Dados_Cadastro;
import br.com.rsi.hub_bdd.pageObject.HomePage;
import br.com.rsi.hub_bdd.pageObject.ProductoLupaPage;


public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private Dados_Cadastro dadosCadastro;
	private ProductoLupaPage productoLupaPage;
	private BuscaProdutoTela buscaProdutoTela ;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public Dados_Cadastro getDadosCadastro() {
		return (dadosCadastro == null) ? dadosCadastro = new Dados_Cadastro(driver) : dadosCadastro;
	}

	public ProductoLupaPage getBuscaLupa() {
		return (productoLupaPage == null) ? productoLupaPage = new ProductoLupaPage(driver) : productoLupaPage;
	}

	public BuscaProdutoTela getBuscaTela() {
		return (buscaProdutoTela == null) ? buscaProdutoTela = new BuscaProdutoTela(driver) : buscaProdutoTela;
	}
}
