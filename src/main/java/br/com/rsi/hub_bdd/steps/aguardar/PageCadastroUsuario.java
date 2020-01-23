package br.com.rsi.hub_bdd.steps.aguardar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PageCadastroUsuario {
	WebDriver driver;
	WebElement element;
	

	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement clickUsuario;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement clickNovaConta;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement digiteNomeUsuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement digiteEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement crieSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement confirmeSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement digitePrimeiroNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement digiteUltimoNome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement digitePhone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement escolhaPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement escolhaCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement digiteEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement digiteEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement digiteCep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement aceiteCondicoes;

	@FindBy(how = How.NAME, using = "register_btnundefined")
	private WebElement registreUsuario;

	
	public void usuario() {
		clickUsuario.click();
	}

	public void novaConta() {
		clickNovaConta.click();
	}

	public void nome_usuario(String sUsuario) throws Exception {
		ExcelUtils.setExcelFile(Caminho.Path_Cadastro + Caminho.File_Cadastro, "Planilha1");
		digiteNomeUsuario.sendKeys(sUsuario);
	}

	public void nome_email(String sEmail) {
		digiteEmail.sendKeys(sEmail);
	}

	public void crie_senha(String sSenha) {
		crieSenha.sendKeys(sSenha);
	}

	public void confirme_senha(String sCSenha) {
		confirmeSenha.sendKeys(sCSenha);
	}

	public void primeiro_nome(String sPrimeironome) {
		digitePrimeiroNome.sendKeys(sPrimeironome);
	}
	
	public void ultime_nome(String sUltimonome) {
		digiteUltimoNome.sendKeys(sUltimonome);
	}
	
	public void phone_usuario(String sPhone) {
		digitePhone.sendKeys(sPhone);
	}
	
	public void pais_usuario() {
		WebElement element = escolhaPais;
		new Select(element).selectByVisibleText("Brazil");
	}
	
	public void cidade_usuario(String sCidade) {
		escolhaCidade.sendKeys(sCidade);
	}
	
	public void endereco_usuario(String sEndereco) {
		digiteEndereco.sendKeys(sEndereco);
	}
	
	public void estado_usuario(String sEstado) {
		digiteEstado.sendKeys(sEstado);
	}
	
	public void cep_usuario(String sCep) {
		digiteCep.sendKeys(sCep);
	}
	
	public void aceiteCondicoes() {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		WebElement element =  aceiteCondicoes;
		ex.executeScript("arguments[0].click();", element);
	}
	
	public void regristra_usuario() {
		registreUsuario.click();
	}
	
	@SuppressWarnings("unused")
	public void  chamando_planilha() throws Exception {
		
		ExcelUtils.setExcelFile(Caminho.Path_Cadastro + Caminho.File_Cadastro, "Planilha1");
		
		String sUsuario = ExcelUtils.getCellData(1, 0);
		
		String sEmail = ExcelUtils.getCellData(1, 1);
		
		String sSenha = ExcelUtils.getCellData(1, 2);
		
		String sCSenha = ExcelUtils.getCellData(1, 3);
		
		String sPrimeironome = ExcelUtils.getCellData(1, 4);
		
		String sUltimonome = ExcelUtils.getCellData(1, 5);
		
		String sPhone = ExcelUtils.getCellData(1, 6);
		
		String escolhaPais = ExcelUtils.getCellData(1, 7);///////
		
		String sCidade = ExcelUtils.getCellData(1, 8);
		
		String sEndereco = ExcelUtils.getCellData(1, 9);
		
		String sEstado = ExcelUtils.getCellData(1, 10);
		
		String sCep = ExcelUtils.getCellData(1, 11);
		

		
	}
	
	
	
	
}
