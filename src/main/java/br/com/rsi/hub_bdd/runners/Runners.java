package br.com.rsi.hub_bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.MonochromeFormats;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", 
							glue = { "br.com.rsi.hub_bdd.steps" }, 
							plugin = "Pretty", 
							monochrome = true,
							snippets = SnippetType.CAMELCASE,
							dryRun = false,
							strict = false
							
							)

public class Runners {

}
