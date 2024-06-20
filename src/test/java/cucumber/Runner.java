package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/calcLoan.feature"},
		dryRun = !true,
		glue = {"cucumber"},
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		plugin= {"pretty","html:cucumberreport/index.html"}
		)
public class Runner extends AbstractTestNGCucumberTests{
	
}
