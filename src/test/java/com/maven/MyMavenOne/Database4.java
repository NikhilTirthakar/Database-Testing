package com.maven.MyMavenOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database4 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhildatabase","root","root");
		
		//	    String url = "jdbc:mysql://localhost:3306/classicmodels";
		//	    Connection con = DriverManager.getConnection(url, "root", "root");


		System.out.println("connected");	

		Statement  smt=con.createStatement();
				
		ResultSet rs=smt.executeQuery("");	

	}

}
