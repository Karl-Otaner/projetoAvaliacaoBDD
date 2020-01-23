package br.com.rsi.hub_bdd.steps.aguardar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageBuscaDeProdutoPaginaPrincipal {
	public static WebElement element;
	
	@FindBy(how = How.ID, using = "18")
	private WebElement ProdutoEscolhido;
	
	public void escolhendoCor() {
		ProdutoEscolhido.click();
	}
	

}
