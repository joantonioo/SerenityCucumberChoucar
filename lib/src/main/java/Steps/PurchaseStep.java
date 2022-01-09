package Steps;

import static org.junit.Assert.assertEquals;

import PageObject.PayPageObject;
import net.thucydides.core.annotations.Step;

public class PurchaseStep {
    
	PayPageObject Page = new PayPageObject();
	
	@Step
	public void StartStore() {
	    Page.open();
	}
	@Step  
	public void LoginOnPage(String mail, String pasw) throws InterruptedException {
		Page.Credentials(mail, pasw);
	}
	@Step
	public void Select() throws InterruptedException {
	    Page.SelectDresses();
	}
	@Step
	public void Succes() {
		assertEquals("Your order on My Store is complete.", Page.Confirm());
	}
}