package NgPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class ExternalData {

	WebDriver driver= null;
	
	@Test
	public void xternalData() throws IOException
	{
		
   Properties prop= new Properties();
   FileInputStream Fis= new FileInputStream("C:\\Users\\katka\\workspace\\TestNg\\src\\NgPackage\\datadriven.properties");
   prop.load(Fis);
   
  
if(prop.getProperty("browser").equals("firefox"))
{
	driver= new FirefoxDriver();
}
else if(prop.getProperty("browser").equals("chrome"))
{
	driver= new ChromeDriver();
}	
else

{
	driver= new InternetExplorerDriver();
}
driver.get(prop.getProperty("url"));
		
	}
	
}
