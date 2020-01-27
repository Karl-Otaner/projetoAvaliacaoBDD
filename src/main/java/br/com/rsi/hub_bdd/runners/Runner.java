package br.com.rsi.hub_bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "Feature", 
				glue = { "br.com.rsi.hub_bdd.stepDefinition" },
				monochrome = true,
//						dryRun = true,
					tags = {"@Sucesso", "@Falha"}	
)

						
//				snippets = SnippetType.CAMELCASE
						//tags = {"~@Falha, @Sucesso"}
				
public class Runner {

}
