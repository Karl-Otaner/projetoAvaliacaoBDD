package br.com.rsi.hub_bdd.steps.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import br.com.rsi.hub_bdd.stpes.utils.Caminho;
import br.com.rsi.hub_bdd.stpes.utils.ExcelUtils;





public class PageBuscaProdutoLupa {
	 WebElement element;
	
	 @FindBy(how = How.ID, using = "menuSearch" )
	 private WebElement clickLupa;
	 
	 @FindBy(how = How.ID, using = "autoComplete" )
	 private WebElement digiteProdutoLupa;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[4]/a/div/div[2]/div/div[2]/a[2]/img" )
	 private WebElement produtoLocalizado;
	 
	 @FindBy(how = How.ID, using = "32" )
	 private WebElement clickProduto;
	 
	 
	 public void lupa() {
		 clickLupa.click();
	 }
	 
	 
	 public void digiteNaLupa(String produto) throws Exception {
		 ExcelUtils.setExcelFile(Caminho.Path_Cadastro + Caminho.File_Cadastro, "Planilha2");
		 produtoLocalizado.sendKeys(ExcelUtils.getCellData(1, 0) + Keys.ENTER);
	 }
	 public void produtoLocalizado() {
		 clickProduto.click();
	 }
	 
	



}
