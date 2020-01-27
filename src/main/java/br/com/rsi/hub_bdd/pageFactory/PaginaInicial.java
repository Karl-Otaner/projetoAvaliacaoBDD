package br.com.rsi.hub_bdd.pageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PaginaInicial {
	WebDriver driver;
	WebElement element;

	public PaginaInicial(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.ID, using = "menuUser")
	private WebElement clickLogin;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement clickNovaConta;

	

	public void clickLogin() {
		clickLogin.click();
	}

	public void clickNovaConta() {
		clickNovaConta.sendKeys(Keys.ENTER);;
	}

		
	
}
