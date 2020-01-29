package br.com.rsi.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsi.hub_bdd.cucumber.TestContext;

public class BuscaProdutoTela {
	WebDriver driver;
//	TestContext testContext;
//	BuscaProdutoTela buscaProdutoTela;

	public BuscaProdutoTela(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement tablet;	

	@FindBy(how = How.ID, using = "18")
	private WebElement tabletEscolido;

	@FindBy(how = How.ID, using = "details_10")
	private WebElement Elitebook;
	
	
	
	
	
	public void clickTablet() {
		tablet.click();
	}
	
	public void  tablet2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		tabletEscolido.click();
	}

	public void clikc_Detalhe() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Elitebook);
		
		
	}
	
	
//	public void select_Product(int productNumber) {
//		prd_List.get(productNumber).click();
//	}
//
//	public String getProductName(int productNumber) {
//		return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
//	}

}
