package NgPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GlobalParameters {

	@Test
	public void Login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\katka\\workspace\\TestNg\\src\\NgPackage\\datadriven.properties");
	    prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
	}
	
	
}
