package co.com.screenplay.baseline.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/authentication.feature",
        glue="co.com.screenplay.baseline.stepdefinitions",
        tags = "@Caso1",
        snippets=SnippetType.CAMELCASE)
public class AuthenticationRunner {
}