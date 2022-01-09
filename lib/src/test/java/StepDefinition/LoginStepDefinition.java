package StepDefinition;

import Steps.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

@Steps	
LoginStep login = new LoginStep();

@Given("^Homepage$")
public void homepage() {
	login.abrir();

}

@When("^I enter my ([^\"]*) and ([^\"]*)$")
public void iEnterMyJoseAndCerts(String user, String pasw ) throws InterruptedException {
     login.enterscredentials(user, pasw);
}

@Then("^user login confirmation$")
public void userLoginConfirmation() {
	login.confirmLogin();
}	
	
	
}
