package Runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src\\test\\resources\\Features\\ToPay.feature"},
glue= {"StepDefinition"},plugin = {"pretty"},snippets=SnippetType.CAMELCASE,monochrome=true)
public class ToPayRunner {

}
