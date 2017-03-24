package JavaProgram;

public class MinNum {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int min=2;
		
		int a[][]={{3,4,5},{1,9,2},{6,7,8}};

		for(int i=0;i<3;i++)
		{
			
		for(int j=0;j<3;j++)
	
		{
		if(a[i][j]<min)
		{
			min= a[i][j];
			
			}
		
		}
		
		}
		System.out.println(min);
	}

}
