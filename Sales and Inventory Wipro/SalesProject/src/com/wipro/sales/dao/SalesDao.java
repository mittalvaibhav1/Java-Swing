package com.wipro.sales.dao;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.DButil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class SalesDao {
	public int insertSales(Sales sales) {
		Connection con = DButil.getDBConnection();
		Statement st;
		int res = -1;
		try {
			st = con.createStatement();
			res = st.executeUpdate("INSERT into TBL_SALES values(?,?,?,?,?)"); 
		} 
		catch (SQLException e) {
			System.out.println("Unable to Insert into the Database");
		} 
		return res;
	}
	public String generateSalesID(java.util.Date salesDate) {
		
		return null;
		
	}
	public ArrayList<SalesReport> getSalesReport() {
		
		return null;
	}
}
