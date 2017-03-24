package NgPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTesting extends ExternalData{
	
	
	@BeforeTest
	public void OpenTest() throws IOException
	{
		xternalData();	
		System.out.println("Opening Test");
		
	}
	
	
	
	@BeforeMethod
	public void UserIdGeneration()
	{
		System.out.println("UserIdGeneration");
		
	}
	
	
	
	@Test
	public void OpenBrowser()
	{
		System.out.println("Opening Browser");
		
	}

	@Test
	public void PrintDetails()
	{
		System.out.println("PrintDetails");
		
	}
	
	@AfterTest
	
	public void Close()
	{
		System.out.println("CloseTest");
		
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	
}

