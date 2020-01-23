package cucumberTest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumTest {
	WebDriver driver;
	@Test
	public void main() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("menuUserSVGPath")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Karl_Otaner106");

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
		
		driver.findElement(By.id("register_btnundefined")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("tabletsTxt"))));
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		assertEquals("http://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());
		
//		driver.quit();
//		
	}

}
