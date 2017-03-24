package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomepage;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.EmailID().sendKeys("akhila");
		rd.Password().sendKeys("katkam");
		//rd.Signin().click();
		rd.Homepage().click();
		RediffHomepage rh= new RediffHomepage(driver);
		rh.Search().sendKeys("Karthik");
		rh.Submit().click();
		
		
			
	}

}
