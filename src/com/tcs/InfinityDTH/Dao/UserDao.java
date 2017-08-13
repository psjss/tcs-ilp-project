package com.tcs.InfinityDTH.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.tcs.InfinityDTH.Model.InventoryDetails;
import com.tcs.InfinityDTH.Model.StbDetails;
import com.tcs.InfinityDTH.Model.UserDetails;
import com.tcs.InfinityDTH.Util.DBConnection;



public class UserDao
{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	
	public UserDetails checkUser(String userName,  String password)
	{
		UserDetails userDetail = new UserDetails();
		
		try
		{
			con = DBConnection.getConnection();
			if(con != null)
				System.out.println("con active");
		
			
			pst = con.prepareStatement("SELECT * FROM USERDETAILS WHERE USER_NAME = ? AND PASSWORD = ? ");
			pst.setString(1, userName);
			pst.setString(2, password);
			rs = pst.executeQuery();
			 while(rs.next())
			 {
				  String userType = rs.getString("USER_TYPE");
				  String firstName = rs.getString("FIRST_NAME");
				  String lastName = rs.getString("LAST_NAME");
				  int userID = rs.getInt("user_id");
				  userDetail.setFirst_name(firstName);
				  userDetail.setLast_name(lastName);
				  userDetail.setUserId(userID);
				  userDetail.setUser_type(userType);
				  	
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
		return userDetail;
	}
	
	public ArrayList<InventoryDetails> getStbDetails(String stbType)
	{
		ArrayList<InventoryDetails> stbDetail= new ArrayList<InventoryDetails>();
		try
		{
			con = DBConnection.getConnection();
			System.out.println("check 1");
			System.out.println(stbType);
			pst = con.prepareStatement("select  * from InventoryList where set_top_box_type =?");
			pst.setString(1, stbType);
			rs = pst.executeQuery();
			System.out.println("check 2");
			System.out.println("hello");
			while(rs.next())
			{
				
				InventoryDetails s= new InventoryDetails();
				s.setInventoryMac(rs.getString("set_top_box_MAC_id"));
				s.setInventoryType(rs.getString("set_top_box_type"));
				s.setInventorySerial(rs.getString("set_top_box_serial_number"));
				stbDetail.add(s);
				break;
				
			}
			 for(InventoryDetails c:stbDetail){
				  System.out.println(c.getInventoryMac());
				  System.out.println(c.getInventorySerial());
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
		return stbDetail;
	}
	
	
	public  ArrayList<StbDetails> getStbPriceDetails(String stbType,String billtype) throws Exception
	{
		ArrayList<StbDetails> stbdet = new ArrayList<StbDetails>();
		try
		{
			con = DBConnection.getConnection();
		
			double tax = 0;
			pst = con.prepareStatement(" select * from SetTopBox where set_top_box_type=? and billing_type=?");
			pst.setString(1, stbType);
			pst.setString(2, billtype);
			ResultSet rs1 = pst.executeQuery();

			while(rs1.next())
			{
				int deposit = 0;
				StbDetails det = new StbDetails();
				
				det.setStbType(rs1.getString("set_top_box_type"));
				det.setPrice(rs1.getInt("price"));
				det.setInstallationCharges(rs1.getInt("installation_charges"));
				det.setDiscount(rs1.getInt("discount"));
				det.setDeposit(deposit);
				tax = ((0.12*(rs1.getInt("price")))+(rs1.getInt("installation_charges"))+0-(rs1.getInt("discount")));
				double totalprice=tax+(rs1.getInt("price"));
				det.setTax(tax);
				det.setTotalCost(totalprice - 200);
				det.setStbId(rs1.getInt("set_top_box_id"));

				stbdet.add(det);
				break;
			}

			for(StbDetails s:stbdet)
			{
			
				System.out.println(s.getPrice());
				System.out.println(s.getTotalCost());

				System.out.println(s.getStbType());
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

		return stbdet;
	}
	
	
	
	public int addPurchasedStb(double tax, int stbId, int userID, String userName)
	{
		PreparedStatement pst1 = null;
		ResultSet rs1 = null;
		int i = 0;
		try
		{
			System.out.println("tax and stbid in dao is" +tax +stbId);
			con = DBConnection.getConnection();
			System.out.println("user id in userDao = " +userID);
			System.out.println("user name in userDao = " +userName);
			pst1 = con.prepareStatement("SELECT * FROM PurchaseSetTopBox WHERE SET_TOP_BOX_ID = ? AND USER_ID = ?");
			pst1.setInt(1, stbId);
			pst1.setInt(2, userID);
			rs1 = pst1.executeQuery();
			if(rs1.next())
			{
				return i;
			}
			pst = con.prepareStatement("INSERT INTO PurchaseSetTopBox VALUES (PURCHASE_STB.nextval,?,?,?,?)");
			pst.setInt(1, userID);
			pst.setString(2, userName);
			pst.setDouble(3, tax);
			pst.setInt(4, stbId);
			i = pst.executeUpdate();
			
			if(i == 1)
				return i;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

}
