package br.com.rsi.hub_bdd.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductoLupaPage {
	WebDriver driver;

	public ProductoLupaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement Complete;

	@FindBy(how = How.ID, using = "searchPage")
	private WebElement page; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div/div")
	private WebElement btnfechar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]")
	private WebElement mouseWait;

	public void click_lupa() {
		lupa.click();
	}

	public void enter_autoComplete() {
		Complete.sendKeys("KENSINGTON ORBIT 72337 TRACKBALL WITH SCROLL RING");
	}

	public void click_btnfechar() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(mouseWait));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnfechar);
	}
	public void Click_mouse() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mouseWait));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mouseWait);

	}

}
