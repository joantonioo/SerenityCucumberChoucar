package StepDefinition;

import java.util.List;
import Models.User;
import Steps.RegisterStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinition {
	
	@Steps
	RegisterStep Register = new RegisterStep();
	
	@Given("User is on home page")
	public void userIsOnHomePage() {
       Register.UserHomePage();
	}

	@When("^the user enters$")
	public void theUserEnters(DataTable table) {
		List<List<String>> data = table.asLists(String.class);
		String mail = data.get(1).get(0);
		String firstname = data.get(1).get(1);
		String lasttname = data.get(1).get(2);
		String pasw = data.get(1).get(3);
		Register.EntersCredentials(mail, lasttname, firstname, pasw);
		
	}
	@When("^the user writes your address$")
	public void theUserWritesYourAddress(DataTable Address) {
		List<List<String>> data = Address.asLists(String.class);
		String company = data.get(1).get(0);
		String address = data.get(1).get(1);
		String house = data.get(1).get(2);
		String city = data.get(1).get(3);
		String state = data.get(1).get(4);
		String postal = data.get(1).get(5); 
		String country = data.get(1).get(6); 
		String info = data.get(1).get(6);
		Register.WriteCredentials(company, address, house, city, state, postal, country, info);
	}

	@When("^the user writes moiles$")
	public void theUserWritesMoiles(DataTable Call) throws InterruptedException {
		List<List<String>> data = Call.asLists(String.class);
		String homePhone  = data.get(1).get(0);
		String cellphone = data.get(1).get(1);
		String references  = data.get(1).get(2);
		Register.numbers(homePhone, cellphone, references);
	}

	@Then("^I verify the verify new successful customer$")
	public void iVerifyTheVerifyNewSuccessfulCustomer() {
		 Register.verifysuccessful();
	}

}
