package steps;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.HomePage;
import page.IncorrectMessagePage;

public class HomeSteps {
	WebDriver driver = StepBase.driver;
	HomePage homepage = new HomePage(driver);
	IncorrectMessagePage incorretMessagePage = new IncorrectMessagePage(driver);
	
	@Given("I am in homepage {string}")
	public void i_am_in_homepage(String URL) {
		driver.navigate().to(URL);
	   
	}
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
	    homepage.typeCredential(username, password);
	}
 
	@When("click on login button")
	public void click_on_login_button() {
	    homepage.clickOnLoginButton();
	}

	@Then("{string} error message displayed")
	public void i_am_in_incorrect_message_page(String errMsg) throws InterruptedException {
		
		String actual = incorretMessagePage.getInvalidMessage();
		Assert.assertTrue(actual.contains(errMsg));
		//Assert.assertEquals(actual, errMsg);
	  
	}



}
