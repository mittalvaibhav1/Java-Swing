package com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@Ricks-Flying-Stick:1521:xe","SalesAdmin","password");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Driver Error");
		} 
		catch (SQLException e) {
			System.out.println("Connection Error");
		}
		return con;
	}
}
