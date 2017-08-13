package com.tcs.InfinityDTH.Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP";
	static String user = "aja164core";
	static String pass = "aja164core";
	
		
	public static Connection getConnection() throws SQLException
	{
		Connection con = null;
		
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
								
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeConenction(Connection con)
	{
		if(con != null)
		{
			try
			{
				con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
	}

}
