package BrowserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser{
	
	
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browserName, String url)
	{
		
		if(browserName.equals("firefox"))
			
		{
			driver=new FirefoxDriver();
		}
		
		
		else if(browserName.equals("Chrome"))
	
		{System.setProperty("webdriver.chrome.driver", "C://Users//Tester//Desktop//Softwares//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
			
		}
		driver.manage().window().maximize();
		driver.get(url);
	
		return driver;
	}

}
