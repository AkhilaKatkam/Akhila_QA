package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow rw;
	public static XSSFCell cl;
	 public static FileInputStream fis;
	 
	
	

	public static void main(String[] args) throws IOException {
		
		
		String value=getcelldata(2,2);
		System.out.println(value);
		
		
		// TODO Auto-generated method s
	}
	
	public static String getcelldata(int row, int col) throws IOException
	{
		fis= new FileInputStream("D:\\DDR.xlsx");
		wb=new XSSFWorkbook(fis);
	    sh = wb.getSheet("akhila");
	    rw = sh.getRow(row);
	    cl = rw.getCell(col);
		return cl.getStringCellValue();
	}

}

