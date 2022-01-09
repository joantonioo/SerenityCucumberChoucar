package StepDefinition;

import Steps.PurchaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PurchaseStepDefinition {
	
	@Steps	
	PurchaseStep pay = new PurchaseStep();
	
	@Given("^start in virtual store$")
	public void startInVirtualStore() {
	    pay.StartStore();
	}

	@When("^enter my ([^\"]*) and ([^\"]*) fin$")
	public void enterMyTgrhkGmailComAndF096r3e5434Fin(String email, String Key) throws InterruptedException {
       pay.LoginOnPage(email, Key);
	}

	@When("^select dresses$")
	public void selectDresses() throws InterruptedException {
	   pay.Select();
	}

	@Then("^confirm purchase$")
	public void confirmPurchase() {
	   pay.Succes();
	}	

	

}
