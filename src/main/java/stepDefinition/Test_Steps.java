package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public abstract class Test_Steps {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Dado("^o usuario esta na pagina inicial do site advantage online shopping$")
	public void o_usuario_esta_na_pagina_inicial_do_site_advantage_online_shopping() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Quando("^o usuario clicar em botao de login$")
	public void oUsuarioClicarEmBotaoDeLogin() throws Throwable {
		driver.findElement(By.id("menuUserSVGPath")).click();
	
	}
	
	@Quando("^Aguardar um tempo para carregar a pagina$")
	public void aguardarUmTempoParaCarregarAPagina() throws Throwable {
	
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
    
	}

	@Quando("^o usuario clicar em criar conta$")
	public void oUsuarioClicarEmCriarConta() throws Throwable {
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();

	}

	@Quando("^Preencher formulario de cadastro$")
	public void preencherFormularioDeCadastro() throws Throwable {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Karl_Otaner107");

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

	@Quando("^Clicar no botao de registro$")
	public void clicarNoBotaoDeRegistro() throws Throwable {
		driver.findElement(By.id("register_btnundefined")).click();

	}

	@Entao("^Validar se retornou a pagina principal$")
	public void validarSeRetornouAPaginaPrincipal() throws Throwable {
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		assertEquals("http://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());

		
	}

	@Quando("^usuario digitar Login e Senha$")
	public void usuarioDigitarLoginESenha(DataTable dados1) throws Throwable {
		List<List<String>> data = dados1.raw();
		
		
		driver.findElement(By.name("username")).sendKeys(data.get(1).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));
	}

	@Quando("^clicar no botao Sing in$")
	public void clicar_no_botao_Sing_in() throws Throwable {
		driver.findElement(By.id("sign_in_btnundefined")).click();
	}
	
	@Entao("^validar mensagem de usuario ou senha  incorretos$")
	public void validar_mensagem_de_usuario_ou_senha_incorretos() throws Throwable {
		assertTrue(driver.getPageSource().contains("Incorrect user name or password"));
	    driver.quit();

	   
	}

}
