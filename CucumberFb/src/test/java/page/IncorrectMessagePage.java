package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.IncorrectMessageModel;

public class IncorrectMessagePage extends IncorrectMessageModel {

	public IncorrectMessagePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getInvalidMessage() throws InterruptedException {
		WebElement message = getIncorrectMessage();
		return message.getText().toString();
	}

}
