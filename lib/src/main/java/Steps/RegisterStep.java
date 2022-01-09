package Steps;



import static org.junit.Assert.assertEquals;

import PageObject.RegisterPageObject;
import net.thucydides.core.annotations.Step;

public class RegisterStep {

	RegisterPageObject Register = new RegisterPageObject();

	@Step
	public void UserHomePage() {
		Register.open();
	}

	@Step
	public void EntersCredentials(String mail, String firtname, String lastname, String pass) {
		Register.credentials(mail, firtname, lastname, pass);

	}

	@Step
	public void WriteCredentials(String company, String address, String house, String city, String state, String postal,
			String country, String info)  {
		Register.address(company, address, house, city, state, postal, country, info);
	}

	@Step
	public void numbers(String Phone, String cell, String ref) throws InterruptedException {
		Register.numbers(Phone, cell, ref);
	}
	
	@Step
	public void verifysuccessful() {
		assertEquals("My account",Register.susccessful());  
		
	}
}
