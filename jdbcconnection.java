package DBtest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jdbcconnection {
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		
String port="3306";
String host="localhost";
		
		Connection con=  DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb","root","password");
		
      Statement s=con.createStatement();
    ResultSet  Rs=s.executeQuery("select * from credentials where scenario ='zerobalancecard'");
      
    while(Rs.next())
   {
     // System.out.println(Rs.getString("username"));
      //System.out.println(Rs.getString("password"));
     
	
    driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(Rs.getString("username"));    
    driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(Rs.getString("password"));
    driver.findElement(By.xpath(".//*[@id='Login']")).click();

}
	}

	}
