package br.com.rsi.hub_bdd.steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Cadastro_Usuario {
	WebDriver driver;

	@Dado("^entro na pagina inicial do advantage online shopping$")
	public void entro_na_pagina_inicial_do_advantage_online_shopping() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Quando("^clico para fazer login$")
	public void clico_para_fazer_login() throws Throwable {
		driver.findElement(By.id("menuUserSVGPath")).click();
	}

	@Quando("^crio uma nova conta$")
	public void crio_uma_nova_conta() throws Throwable {
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
	}

	@Quando("^preencho os dados solcitados$")
	public void preencho_os_dados_solcitados() throws Throwable {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Karl_Otaner4");

		driver.findElement(By.name("emailRegisterPage")).sendKeys("carlos.silva@rsinet.com.br");

		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Aa123456");

		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Aa123456");

		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Karl");

		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Otaner");

		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("55 11 1234567");

		Select drpPais = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		drpPais.selectByVisibleText("Brazil");

		driver.findElement(By.name("cityRegisterPage")).sendKeys("Osasco");

		driver.findElement(By.name("addressRegisterPage")).sendKeys("Av. Domingos Odália Filho, 301 - Centro");

		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("SAO PAULO");

		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("06010-060");

		driver.findElement(By.name("i_agree")).click();
	}

	@Quando("^clico em registro de novo usuario$")
	public void clico_em_registro_de_novo_usuario() throws Throwable {
		driver.findElement(By.id("register_btnundefined")).click();
	}

	@Entao("^volto para a pagina principal com o usuario cadastrado$")
	public void volto_para_a_pagina_principal_com_o_usuario_cadastrado() throws Throwable {
		assertEquals("http://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
	}
	@Quando("^preencho os dados solcitados com um usuario ja cadastrado$")
	public void preencho_os_dados_solcitados_com_um_usuario_ja_cadastrado() throws Throwable {


	}

	@Entao("^aparece a mensagem que o usuario ja esta cadastrado$")
	public void aparece_a_mensagem_que_o_usuario_ja_esta_cadastrado() throws Throwable {


	}
}
