package Demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger("Log4j_Demo");
		PropertyConfigurator.configure("C:\\Users\\katka\\workspace\\Log4j\\log4j.properties");

		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		log.info("Browser Opened");
		
		driver.get("http:\\gmail.com");
	log.info("Gmail page is opened");
	
	try{
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("akhila@gmail.com");
		log.info("Email is entered");
	}
	
	catch(Exception e)
	
	{
		
		log.error("Element error");
	}
	}

}
