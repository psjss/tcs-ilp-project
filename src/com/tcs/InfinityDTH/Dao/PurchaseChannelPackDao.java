package com.tcs.InfinityDTH.Dao;



import java.sql.*;
import java.util.ArrayList;

import com.tcs.InfinityDTH.Model.Bill;
import com.tcs.InfinityDTH.Util.DBConnection;






public class PurchaseChannelPackDao
{
	
	public int check(int stbid,int userid,String billingtype)
	{
		
		ResultSet rs =  null;
		PreparedStatement ps = null;
	
		int i=0;
		int j=0;
		Connection con = null;
		
		try
		{
			con=DBConnection.getConnection();
			 ps = con.prepareStatement("select * from bill");
			 rs=ps.executeQuery();
			 while(rs.next())
			 {
				 if(stbid==rs.getLong(2))
				 {
					 j=1;
					 return j;
				 }
			 }
			
			if(j==0){
			 ps = con.prepareStatement("insert into bill values(?,?,?,?,?,?,?)");
		ps.setInt(1,userid);
		ps.setInt(2, stbid);
		ps.setInt(3,200);
		ps.setString(4, billingtype);
		ps.setString(5, null);
		ps.setString(6, null);
		if(billingtype.equalsIgnoreCase("postpaid"))
		{
		ps.setInt(7,0);
		}
		else{
			ps.setInt(7,1000);	
		}
		i=ps.executeUpdate();
			}
		

		
		
		

			 
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con != null)
			{
				DBConnection.closeConenction(con);
			}
		}
		return i;
	}
public int addPack(String[] a,int id)
{
	int sum=0;
	String as=null;
	Connection con = null;
try 
{
	con=DBConnection.getConnection();
	for(int i=0;i<a.length;i++)
	{
		if(i==0)
			as=a[i];
		else
			as=as+","+a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		
		PreparedStatement ps = con.prepareStatement("select price from package_1 where package_id = ?");
		ps.setString(1,a[i]);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
		int price = rs.getInt("price");
		sum = price+sum;
		}
		PreparedStatement ps1=con.prepareStatement("insert into packagestb values(?,?)");
		ps1.setInt(1,id);
		ps1.setString(2, a[i]);
		ps1.executeUpdate();
		
		

		
	}
	PreparedStatement ps2 = con.prepareStatement("update bill set package_id=? where stb_id=?");
	ps2.setString(1,as);
	ps2.setInt(2,id);
	ps2.executeUpdate();
	return sum;
} 
	catch (SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		if(con != null)
		{
			DBConnection.closeConenction(con);
		}
	}
	return 0;
}


	public int channelPrice(String[] a,int id)
	{
		int sum=0;
		String b=null;
		Connection con = null;
		
	try 
	{
		con = DBConnection.getConnection();
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
				b=a[i];
			else
				b=b+","+a[i];
		}
		System.out.println(b);
		for(int i=0;i<a.length;i++)
		{
			
			PreparedStatement ps = con.prepareStatement("select price from channel_1 where id = ?");
			ps.setString(1,a[i]);
		
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			int price = rs.getInt("price");
			sum = price+sum;
			}
			PreparedStatement ps1=con.prepareStatement("insert into channelstb values(?,?)");
			ps1.setInt(1,id);
			ps1.setString(2, a[i]);
			ps1.executeUpdate();
		}
		PreparedStatement ps2 = con.prepareStatement("update bill set channel_id=? where stb_id=?");
		ps2.setString(1,b);
		ps2.setInt(2,id);
		ps2.executeUpdate();
		return sum;
		
	} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally
	{
		if(con != null)
		{
			DBConnection.closeConenction(con);
		}
	}
		return 0;
			}

	


	
	public int update(int a,int b)
	{
		int a1=0;
		Connection con = null;
		try 
		{
			con=DBConnection.getConnection();
			PreparedStatement ps1 = con.prepareStatement("select price from bill where stb_id = ?");
			ps1.setInt(1, a);
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				 a1=rs.getInt("price");
			}
			a1=a1+b;
			PreparedStatement ps2 = con.prepareStatement("update bill set price=? where stb_id=?");
			ps2.setInt(1,a1);
			ps2.setInt(2,a);
			ps2.executeUpdate();
	}
		catch(SQLException se)
		{
			System.out.println("UpdateException");
		}
		finally
		{
			if(con != null)
			{
				DBConnection.closeConenction(con);
			}
		}
		return a1;
	}
	
	public Bill getlist(int id)
	{
		Bill bill=new Bill();
	
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> list1=new ArrayList<>();
		Connection con = null;
		ResultSet rs=null;
		try 
		{
			con=DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select set_top_box_id from purchasesettopbox where user_id=?");
			ps.setInt(1,id);
			 rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1));
			
			}
			bill.setList(list);
			if(!list.isEmpty())
			{
				for(String s:list)
				{
					try
					{
						
				
						PreparedStatement ps1 = con.prepareStatement("select * from settopbox where set_top_box_id=?");
						ps1.setString(1,s);
						 rs=ps1.executeQuery();
					
						while(rs.next())
						{
							list1.add(rs.getString(10));
						
						}
						
						bill.setList1(list1);
					
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				}
			}
		
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return bill;
	
}
	
}