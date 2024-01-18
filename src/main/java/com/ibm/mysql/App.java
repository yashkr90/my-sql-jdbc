package com.ibm.mysql;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
        			System.out.println("done."+connection);
        }
        catch (SQLException e) {
    		// TODO: handle exception
    		e.printStackTrace();
    	}
    }
}
