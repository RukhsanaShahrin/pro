package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncorrectMessageModel extends BaseModelFbcum {

	public IncorrectMessageModel(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement getIncorrectMessage() throws InterruptedException {
		
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));
	}

}
