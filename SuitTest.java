package NgPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitTest {
	
	@BeforeSuite
	public void FirstMethod()
	{
	System.out.println("Before suit");
	}
	
	@AfterSuite
	public void SecondMethod()
	{
	System.out.println("After suit");
	}
}
