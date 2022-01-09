package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://automationpractice.com/index.php")
public class PayPageObject extends PageObject {
	public void Credentials(String User, String key) throws InterruptedException  {
		
		$(By.className("header_user_info")).click();
		 $(By.id("email")).sendKeys(User);
		 $(By.id("passwd")).sendKeys(key);
		 $(By.id("SubmitLogin")).click();
		 Thread.sleep(2000);
	}
	public void SelectDresses() throws InterruptedException {
		$(By.xpath("//a[@title='Women' and @class='sf-with-ul']")).click();
		$(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).click();
		Thread.sleep(4000);
		$(By.xpath("//button[@type='submit' and @name='Submit']/span")).click();
		$(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		$(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']/span")).click();
	    $(By.xpath("//button[@name='processAddress']")).click();
	    $(By.xpath("//input[@type='checkbox' and @name='cgv']")).click();
		$(By.name("processCarrier")).click();
		$(By.xpath("//a[@class='bankwire' and @title='Pay by bank wire']")).click();
        $(By.xpath("//button[@class='button btn btn-default button-medium' and @type=\"submit\"]")).click();
	
	}
	public String Confirm() {
        String valor = $(By.xpath("//p[@class='cheque-indent']/strong")).getText();
		return valor;
		
	}
	
	
}
