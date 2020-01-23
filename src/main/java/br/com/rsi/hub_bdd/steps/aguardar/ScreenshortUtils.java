package br.com.rsi.hub_bdd.steps.aguardar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class ScreenshortUtils {
	public static void printTela(WebDriver driver, String arquivo) {
		File screenshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshort, new File("C:\\Users\\carlos.silva\\ToolsQA\\BDD\\BDD\\Screenshort/" + OrganizadorData.dataHorParaArquvio()+".png"));
			
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}
}


