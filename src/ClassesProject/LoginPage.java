package ClassesProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

//@FindBy(how=How.XPATH, using=".//*[@id='globalnav__menu-bar']/ul/li[4]/button")
//WebElement selectt;


@FindBy(how=How.XPATH, using=".//*[@id='globalnav__menu-bar']/ul/li[4]/button")
WebElement selectl;
@FindBy(how=How.XPATH, using= ".//*[@id='adobeid_username']") WebElement User_Login;
@FindBy(how=How.XPATH ,using=".//*[@id='adobeid_password']") WebElement password;
	
@FindBy(how=How.XPATH, using=".//*[@id='sign_in']")
WebElement submitbutton;
	
//@FindBy(how=How.LINK_TEXT, using="Sign In")

//WebElement click;
@FindBy(how=How.XPATH, using=".//*[@id='globalnav__menu-bar']/ul/li[1]/button")
WebElement selectt;
@FindBy(how=How.XPATH, using= "html/body/main/section/figure[1]/section/div[2]/div[1]/ul/li[1]/a/span")
WebElement selectp;



		

@FindBy(how=How.XPATH, using= "html/body/main/div[1]/div/div/div/ul/li[5]/div/p[3]/a")
WebElement selectXD;

		
		
		@FindBy(how=How.XPATH, using= "html/body/nav/nav/a[4]")
		WebElement selectXDD;

public void login_wordpress(String UID, String pswd,String search)
{
	
	//classa.click();
	///click.click();
	//driver.switchTo().frame(dswitch);
	selectl.click();
	User_Login.sendKeys(UID);
	password.sendKeys(pswd);
	submitbutton.click();
//	Actions action = new Actions(driver);
	 
   // action.moveToElement(selectp).build().perform();
	
	selectt.click();
	selectp.click();
	

	selectXD.click();
	selectXDD.click();
	//selectp.sendKeys(search);
	//selectp.sendKeys(Keys.RETURN);
	
}
}