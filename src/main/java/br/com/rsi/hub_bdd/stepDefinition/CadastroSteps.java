package br.com.rsi.hub_bdd.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsi.hub_bdd.cucumber.TestContext;
import br.com.rsi.hub_bdd.manager.WebDriverManager;
import br.com.rsi.hub_bdd.pageObject.Dados_Cadastro;
import br.com.rsi.hub_bdd.pageObject.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	WebDriver driver;
	HomePage homepage;
	WebDriverManager webDriverManager;
	HomePage login;
	TestContext testContext;
	Dados_Cadastro dadoscadastro;

	public CadastroSteps(TestContext context) {
		this.testContext = context;
		homepage = testContext.getPageObjectManager().getHomePage();
		webDriverManager = testContext.getWebDriverManager();
	}

	@Dado("^o usuario esta na pagina inicial do site advantage online shopping$")
	public void o_usuario_esta_na_pagina_inicial_do_site_advantage_online_shopping() throws Throwable {
		driver = webDriverManager.getDriver();
		homepage = testContext.getPageObjectManager().getHomePage();

	}

	@Quando("^o usuario clicar em botao de login$")
	public void o_usuario_clicar_em_botao_de_login() throws Throwable {

		login.clickLogin();
	}

	@Quando("^o usuario clicar em criar conta$")
	public void o_usuario_clicar_em_criar_conta() throws Throwable {
		login.clickNovaConta();
	}

	@Quando("^Fazer o cadastro da nova conta$")
	public void fazer_o_cadastro_da_nova_conta() throws Throwable {

		dadoscadastro.preencherCadastro();

	}

	@Entao("^validar o retorno a pagina inicial$")
	public void validar_o_retorno_a_pagina_inicial() throws Throwable {
		HomePage.aguardeTempo(driver);
		assertEquals("http://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
	}

	@Quando("^Fazer o cadastro ja existente$")
	public void fazer_o_cadastro_ja_existente() throws Throwable {

		dadoscadastro.preencherCadastro();

	}

	@Entao("^validar mensagem de usuario ja cadastrado$")
	public void validar_mensagem_de_usuario_ja_cadastrado() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HomePage.aguardeTempo(driver);
		assertTrue(driver.getPageSource().contains("User name already exists"));
		webDriverManager.closeDriver();

	}

}
