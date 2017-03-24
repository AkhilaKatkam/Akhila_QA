import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JmeterTest1 {
	
	
	@Test
	public void testing()
	{
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
