package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//WAP to get the details from DB to console 
public class TestExDemo14 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method staretd ");
//		Step1: Loading the Driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");

//		Step2: Create the Connection Object 
//		DriverManager : The basic service for managing a set of JDBC drivers.
//		getConnection: Attempts to establish a connection to the given database URL.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");

//		A connection (session) with a specific database. 
//		SQL statements are executed and results are returned within the context of a connection
//		Step3 : Create the Statement Object 
//		createStatement : Creates a Statement object for sending SQL statements to the database.
		Statement stmt = con.createStatement();

//		Statement: The object used for executing a static SQL statement and returning the results it produces.
//		Executes the given SQL statement, which returns a single ResultSet object.
		
		String sql = "select * from Employee";
		ResultSet rs =stmt.executeQuery(sql);
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		
//		Step4 : Create ResultSet Object for Execution 

//		Step5: Close  the connections 

	}

}
