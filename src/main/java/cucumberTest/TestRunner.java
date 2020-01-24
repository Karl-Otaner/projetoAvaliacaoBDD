package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature1", 
			glue = { "stepDefinition" },
				plugin = "pretty",
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = true,
				strict = false,
				tags = {"@Falha, @Sucesso"}
				
						
							
							)

public class TestRunner {

}
