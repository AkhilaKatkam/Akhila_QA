package Demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Demo {
	
	public static void main(String[]args)
	{
		Logger log=Logger.getLogger("Log4j_Demo");
		PropertyConfigurator.configure("C:\\Users\\katka\\workspace\\Log4j\\log4j.properties");
		log.debug("This is debug");
		log.info("This is Info");
		log.fatal("This is Fatal");
		log.error("This is eror");
		log.warn("This is Warn");
		System.out.println("Hi, fuck off'");
		
		
	}
	

}
