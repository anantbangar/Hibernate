package com.dependencies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class App 
{
	public static void main( String[] args )
    {
		System.out.println("adding dependencies WITH MAVEN");
		
    	try
    	{
    	
    		//Class.forName("oracle.jdbc.driver.OracleDriver");
    		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system123");
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","system123");
    		System.out.println("connection is done.....");
    		
    		Statement stmt=con.createStatement();
    		ResultSet rs=stmt.executeQuery("select * from emp1"); 
    		while(rs.next())
    		{
    			System.out.println(rs.getInt(1)+" "+rs.getString(2));
    		}
    		
    		con.close();
    	}
    	
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
}
