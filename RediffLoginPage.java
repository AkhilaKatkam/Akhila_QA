package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	
	
	public RediffLoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement EmailID()
	{
		
		return driver.findElement(By.xpath(".//*[@id='login1']"));
	}
	
	public WebElement Password()
	{
		
		return driver.findElement(By.xpath(".//*[@id='password']"));
	}
	
	public WebElement Signin()
	{
		
		return driver.findElement(By.xpath(".//input[@name='proceed']"));
	}
	

	public WebElement Homepage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.linkText("Home"));
	}

	
	
}
