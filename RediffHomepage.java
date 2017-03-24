package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	
		WebDriver driver;
	
	public RediffHomepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
     
	@FindBy(id="srchword")
	WebElement Search;
	
	@FindBy(xpath=".//*[@class='newsrchbtn']")
	WebElement Submit;
	
	public WebElement Search()
	{
		
		return Search;
	}
	
	public WebElement Submit()
	{
		
		return Submit;
	}

	}

