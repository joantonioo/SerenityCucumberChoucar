package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://automationpractice.com/index.php")
public class RegisterPageObject extends PageObject {

	 String Firtsname;
	
	
	public void credentials(String email, String name, String lastnamee, String passw) {
		$(By.className("header_user_info")).click();
		$(By.id("email_create")).sendKeys(email);
		$(By.id("SubmitCreate")).click();
		$(By.id("uniform-id_gender1")).click();
		$(By.id("customer_firstname")).sendKeys(name);
		Firtsname=name;
		$(By.id("customer_lastname")).sendKeys(lastnamee);
		$(By.id("passwd")).sendKeys(passw);
		
		
	}

	public void address(String company, String address, String house, String city, String state, String postal,
			String country, String info) {     
		
		Select day = new Select(find(By.id("days")));	
        day.selectByValue("4"); 
        
        $(By.id("uniform-months")).click();
        Select mont = new Select(find(By.id("months")));	
        mont.selectByValue("4");
        $(By.id("uniform-years")).click();
        Select year = new Select(find(By.id("years")));	
        year.selectByValue("1990");         
        $(By.xpath("//input[@type='checkbox' and @name='newsletter']")).click();
		$(By.id("optin")).click();         
		$(By.id("company")).sendKeys(company);
        $(By.id("address1")).sendKeys(address);
        $(By.id("address2")).sendKeys(house);       
        $(By.id("city")).sendKeys(city);       
        $(By.id("uniform-id_state")).click();        
        Select estado = new Select(find(By.xpath("//select[@id='id_state']")));	
        estado.selectByVisibleText(state);
        $(By.id("postcode")).sendKeys(postal);     
        $(By.xpath("//select[@id='id_country']")).click();
        Select Country = new Select(find(By.xpath("//select[@id='id_country']")));	
        Country.selectByValue("21");       
        $(By.xpath("//textarea[@class='form-control']")).sendKeys(info);

       
	}

	public void numbers(String Phone, String cell, String ref) throws InterruptedException {
		$(By.xpath("//input[@type='text'and @name='phone']")).sendKeys(Phone);
		$(By.id("phone_mobile")).sendKeys(cell);
		$(By.id("alias")).sendKeys(ref);
		$(By.id("submitAccount")).click();
		Thread.sleep(3000);
	
	}
	
	public String susccessful() {
		
		 String var = $(By.xpath("//span[@class='navigation_page']")).getText();
		 return var;
     
	}

}
