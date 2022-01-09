package PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class LoginPageObject extends PageObject {

	
	public void writeCredentials(String user, String pass) throws InterruptedException {
		 $(By.className("header_user_info")).click();
		 $(By.id("email")).sendKeys(user);
		 $(By.id("passwd")).sendKeys(pass);
		 $(By.id("SubmitLogin")).click();
		 Thread.sleep(3000);
	}
	public String confirmation() {
		 String conf = $(By.xpath("//span[@class='navigation_page']")).getText();
		 return conf;
	}
	
}








