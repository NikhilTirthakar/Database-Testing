package com.maven.MyMavenOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Database2 
{
	static String id;
	static String password;
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	
	{
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		
		//	    String url = "jdbc:mysql://localhost:3306/classicmodels";
		//	    Connection con = DriverManager.getConnection(url, "root", "root");


		System.out.println("connected");	

		Statement  smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from employees where employeeNumber='1002'");

		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://opensource.demo.orangehrmlive.com/");
			
		
    	
    	while(rs.next())
		{
			id=rs.getString("lastName");
			password=rs.getString("firstName");
			System.out.println("here is table shcema:" +id+ "  " +password);

		}
    	
    	driver.findElement(By.id("txtUsername")).sendKeys(id);
    	driver.findElement(By.id("txtPassword")).sendKeys(password);
    	driver.findElement(By.id("btnLogin")).click();
    	driver.close();
		
    	
    	
    	
	}

}
