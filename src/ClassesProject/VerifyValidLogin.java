package ClassesProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import BrowserFactory.Browser;

public class VerifyValidLogin {

	
	
	@Test
	public void checkvaliduser()
	{
		
		WebDriver driver= Browser.startbrowser("Chrome","https://www.adobe.com/in/");
		
	LoginPage logindetails=PageFactory.initElements(driver, LoginPage.class);
	logindetails.login_wordpress("nitish.sajnani18@gmail.com","Ni_9899639885");
	//login successful
	}
	
}
