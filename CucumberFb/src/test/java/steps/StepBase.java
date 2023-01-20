package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import page.HomePage;

public class StepBase {
	
	static WebDriver driver;
	
	HomePage homepage;
	
	@Before("@chrome")
	public void before() {
		
		driver=getDriver("chrome");
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		
	}
	
	public WebDriver getDriver(String browser) {
		
		if(driver==null)
		{if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
			
		}
		
		return driver;
		
	}
	

}
