package August20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		String url = "jdbc:mysql://localhost:3306/bank";
		String usernam="root";
		String password="sanjaymehra@123";
		
		 // Load MySQL JDBC driver
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    //Connection setup
	    Connection con = DriverManager.getConnection(url, usernam, password);
	    
	    //Statement
	    Statement s= con.createStatement();
	    String selectQuery="Select *from user";
	    ResultSet rs = s.executeQuery(selectQuery);
	    
	    //Selenium
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	    while(rs.next()) {
	    String user=rs.getString("username");	
	    String pass=rs.getString("password");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
        driver.navigate().back();
	    }
	    
	    
	    driver.quit();
        con.close(); 
	}
	
}
