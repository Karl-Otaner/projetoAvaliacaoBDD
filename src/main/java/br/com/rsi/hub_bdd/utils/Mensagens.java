package br.com.rsi.hub_bdd.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mensagens {
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]")
	private WebElement usuarioCadastrado;

	public void msg() {
		usuarioCadastrado.getText();
	}


}
