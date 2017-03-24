package NgPackage;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	
	
	private static final boolean False = false;


	@Test
	public void initialize()
	{
		
		System.out.println("Initial Test");
		
	}

	@Test(dependsOnMethods={"initialize"},alwaysRun=true)
	public void OpenBrowser()
	{
		
		System.out.println("BrowserTest");
	}
		
		@Test(timeOut=30000)
		public void MethodA()

		{
			
			System.out.println("StatementA");
			
		}
		
		
		@Test(enabled=False)
		public void Enabilization()
		{
			
			System.out.println("Enabilizationstatement");
			
		}


		
	}

