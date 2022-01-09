package Steps;

import static org.junit.Assert.assertEquals;

import PageObject.LoginPageObject;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.assertEquals;


public class LoginStep {
	
	LoginPageObject LoginPage = new LoginPageObject();
	
	@Step
	public void abrir() {
      LoginPage.open();

	}
	@Step
	public void enterscredentials(String usuario, String key) throws InterruptedException {
       LoginPage.writeCredentials(usuario,key);
	}
	@Step
	public void confirmLogin() {
		assertEquals("My account",LoginPage.confirmation());  
	}
}
