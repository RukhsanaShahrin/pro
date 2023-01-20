package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModelFbcum{

	public HomeModel(WebDriver driver) {
		super(driver);
		
	}
	//https://www.facebook.com
	
	public WebElement getUserName() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		return userName;
	}
	
	public WebElement getPassword() {
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
		return passWord;
	}
	
	public WebElement getLogin() {
		
		return driver.findElement(By.xpath("//button[@name='login']"));
		
		
	}

}
