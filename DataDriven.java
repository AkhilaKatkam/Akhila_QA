package NgPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	@Test (dataProvider="getData")
	public void userid(String Name,String password, String ID)
	{
		System.out.println("Username");
		System.out.println("UserPassword");
		System.out.println("UserID");
		
	}
	
	@DataProvider
	public Object [][] getData()
	{
		
		Object[][] data= new Object[3][3];
		data[0][0]="ABCD";
		data[0][1]="XYZ";
		data[0][2]="Akhila";
		data[1][0]="q";
		data[1][1]="r";
		data[1][2]="s";
		data[2][0]="t";
		data[2][1]="u";
		data[2][2]="v";
		
		
		return data;
		
		
		
	}
	
	
	
}

