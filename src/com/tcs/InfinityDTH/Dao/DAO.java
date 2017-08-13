package com.tcs.InfinityDTH.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import com.tcs.InfinityDTH.Model.GenerateBill;
import com.tcs.InfinityDTH.Util.DBConnection;

public class DAO 
{
	public ArrayList<GenerateBill> getDetails() throws ClassNotFoundException, SQLException
	{
	
		Connection conn=null;
		ArrayList<GenerateBill> gb=new ArrayList<GenerateBill>();
		//GenerateBill g=new GenerateBill(); 
	try 
	{
		conn=DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT b.user_id,u.user_name,b.stb_id,b.package_id,b.channel_id,b.price,TO_CHAR(sysdate, 'dd/mm/yyyy') x,TO_CHAR(sysdate+15, 'dd/mm/yyyy') y FROM USERDETAILS u RIGHT OUTER JOIN BILL b ON b.USER_ID = u.USER_ID WHERE b.BILLINGTYPE='Postpaid'");
			//ps.setString(1,b);
			ResultSet rs = ps.executeQuery();
			int count=0;
			while(rs.next())
			{
				count++;
			String a1=rs.getString(1);
			String a2=rs.getString(2);
			String a3=rs.getString(3);
			String a4=rs.getString(4);
			String a5=rs.getString(5);
			String a6=rs.getString(6);
			String a7=rs.getString("x");
			String a8=rs.getString("y");
			GenerateBill g=new GenerateBill(a1, a2, a3, a4, a5, a6, a7, a8);
			gb.add(g);
			
			
			}
			//return gb;
			System.out.println("Value Of count"+count);
	}
	catch(SQLException se)
	{
		System.out.println("SQL11");
		se.printStackTrace();
	}
	finally
	{
		if(conn!=null)
		{
			DBConnection.closeConenction(conn);
		}
	}
	
	System.out.println(gb.size());
	return gb;
	
	}
	
	
	public ArrayList<GenerateBill> getDetails1() throws SQLException
	{
	
		Connection conn=null;
		ArrayList<GenerateBill> gb=new ArrayList<GenerateBill>();
		//GenerateBill g=new GenerateBill(); 
	try 
	{
		    conn=DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT b.user_id,u.user_name,b.stb_id,b.package_id,b.channel_id,b.price,(b.current_balance-b.price) Remaining_balance, TO_CHAR(sysdate, 'dd/mm/yyyy') x,TO_CHAR(sysdate+15, 'dd/mm/yyyy') y FROM USERDETAILS u RIGHT OUTER JOIN BILL b ON b.USER_ID = u.USER_ID WHERE b.BILLINGTYPE='Prepaid'");
			//ps.setString(1,b);
			ResultSet rs = ps.executeQuery();
			int count=0;
			while(rs.next())
			{
				count++;
			String a1=rs.getString(1);
			String a2=rs.getString(2);
			String a3=rs.getString(3);
			String a4=rs.getString(4);
			String a5=rs.getString(5);
			String a6=rs.getString(6);
			String a9=rs.getString(7);
			String a7=rs.getString("x");
			String a8=rs.getString("y");
			
			GenerateBill g=new GenerateBill(a1, a2, a3, a4, a5, a6, a7, a8,a9);
			gb.add(g);
			
			}
			//return gb;
			System.out.println("Value Of count"+count);
	}
	catch(SQLException se)
	{
		System.out.println("SQL postpaid exception ");
		se.printStackTrace();
	}
	finally
	{
		if(conn!=null)
		{
			DBConnection.closeConenction(conn);
		}
	}
	System.out.println(gb.size());
	return gb;
	
}
}