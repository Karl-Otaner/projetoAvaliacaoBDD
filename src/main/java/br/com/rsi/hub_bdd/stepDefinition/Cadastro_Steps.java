package br.com.rsi.hub_bdd.stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub_bdd.pageFactory.Dados_Cadastro;
import br.com.rsi.hub_bdd.pageFactory.Gerenciador_Driver;
import br.com.rsi.hub_bdd.pageFactory.Gerenciador_Pagina;
import br.com.rsi.hub_bdd.pageFactory.PaginaInicial;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Cadastro_Steps {
	WebDriver driver;

	PaginaInicial homepage;

	Gerenciador_Pagina gerenciadorPagina;
	Gerenciador_Driver gerenciadorDriver;
	Dados_Cadastro dadosCadastro;
	PaginaInicial login;

	@Before
	public void iniciar() throws Exception {
		driver = Gerenciador_Driver.abreSite();
		PageFactory.initElements(driver, this);

	}

	@Dado("^o usuario esta na pagina inicial do site advantage online shopping$")
	public void o_usuario_esta_na_pagina_inicial_do_site_advantage_online_shopping() throws Throwable {
		dadosCadastro = new Dados_Cadastro(driver);
		login = new PaginaInicial(driver);
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

		dadosCadastro.preencherCadastro();

	}

	@Entao("^validar o retorno a pagina inicial$")
	public void validar_o_retorno_a_pagina_inicial() throws Throwable {
		Gerenciador_Driver.aguardeTempo();
		assertEquals("http://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());

	}

	@Quando("^Fazer o cadastro ja existente$")
	public void fazer_o_cadastro_ja_existente() throws Throwable {

		dadosCadastro.preencherCadastro();

	}

	@Entao("^validar mensagem de usuario ja cadastrado$")
	public void validar_mensagem_de_usuario_ja_cadastrado() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Gerenciador_Driver.aguardeTempo();
		js.executeScript("javascript:window.scrollBy(0,800)");
//		assertEquals("User name already exists", dadosCadastro.msgCadastro());
		assertTrue(driver.getPageSource().contains("User name already exists"));

	}

	@After
	public void fechar() {
		Gerenciador_Driver.fechaSite(driver);
	}
}
