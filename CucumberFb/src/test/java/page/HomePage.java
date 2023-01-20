package page;

import org.openqa.selenium.WebDriver;

import model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void typeCredential(String userName,String password) {
		getUserName().sendKeys(userName);
		getPassword().sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		getLogin().click();
	}

}
