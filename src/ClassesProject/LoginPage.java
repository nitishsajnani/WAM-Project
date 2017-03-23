package ClassesProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}

//@FindBy(how=How.ID, using="authiframe")
//WebElement dswitch;

@FindBy(how=How.XPATH, using=".//*[@id='globalnav__menu-bar']/ul/li[4]/button")
WebElement selectt;

	
	
	@FindBy(how=How.XPATH, using= ".//*[@id='adobeid_username']") WebElement User_Login;
	@FindBy(how=How.XPATH ,using=".//*[@id='adobeid_password']") WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@id='sign_in']")
	WebElement submitbutton;
	
@FindBy(how=How.LINK_TEXT, using="Sign In")

WebElement click;

@FindBy(how=How.XPATH, using="html/body/main/section/figure[1]/article/section/ul/li[1]/a")
WebElement selectp;

public void login_wordpress(String UID, String pswd)
{
	
	//classa.click();
	//click.click();
	//driver.switchTo().frame(dswitch);
	selectt.click();
	User_Login.sendKeys(UID);
	password.sendKeys(pswd);
	submitbutton.click();
	selectp.click();
}
}