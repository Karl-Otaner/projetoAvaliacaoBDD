package br.com.rsi.hub_bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "Feature", 
				glue = { "br.com.rsi.hub_bdd.stepDefinition" },
				monochrome = true,
				plugin =  "pretty",
				snippets = SnippetType.CAMELCASE,
//						dryRun = true,
					tags = {"@Buscadeproduto", "@Valido"}	
)

						
//				snippets = SnippetType.CAMELCASE
						//tags = {"~@Falha, @Sucesso"}
				
public class Runner {

}
