package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryExDemo9 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started ");

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");

		}

		finally {
			con.close();
		}

//		System.out.println(10 / 0);
		System.out.println("main method ended ");
	}

}
