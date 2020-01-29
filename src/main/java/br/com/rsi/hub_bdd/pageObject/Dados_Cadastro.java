package br.com.rsi.hub_bdd.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dados_Cadastro {
	WebDriver Driver;

	public Dados_Cadastro(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement userName;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement userEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement userPassword;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement confirmUserPassword;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement fistName;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement lastName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement phoneUser;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement countryList;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement cityRegister;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement addressRegister;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement regionRegion;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement postalCode;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement clickAgree;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnUnderfined;

	@FindBy(how = How.NAME, using = "username")
	private WebElement login;

	@FindBy(how = How.NAME, using = "password")
	private WebElement senha;

	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement signin;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]")
	private WebElement usuarioCadastrado;

	

	public void preencherCadastro() {

		userName.sendKeys("Karl132");
		userEmail.sendKeys("karl@com.br");
		userPassword.sendKeys("Aa12345");
		confirmUserPassword.sendKeys("Aa12345");
		fistName.sendKeys("Karl");
		lastName.sendKeys("Otaner");
		phoneUser.sendKeys("55 11 2334987");
		Select select = new Select(countryList);
		select.selectByVisibleText("Brazil");
		cityRegister.sendKeys("Osasco");
		addressRegister.sendKeys("Rua 1234");
		regionRegion.sendKeys("São Paulo");
		postalCode.sendKeys("015-1234");
		WebDriverWait wait = new WebDriverWait(Driver, 10);
		wait.until(ExpectedConditions.visibilityOf(clickAgree));
		clickAgree.click();
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].click();", btnUnderfined);
	}

	public String msgCadastro() {
		return usuarioCadastrado.getText();
	
	}
}
