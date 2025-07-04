package testRunner;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
    features = {"src/test/java/features/addToCart.feature"},
    glue = "steps",
    snippets = CucumberOptions.SnippetType.CAMELCASE, 
    dryRun = !true,
    monochrome=true
)
public class Runner extends AbstractTestNGCucumberTests{
}
