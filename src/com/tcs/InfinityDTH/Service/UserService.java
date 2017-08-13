package com.tcs.InfinityDTH.Service;

import java.util.ArrayList;

import com.tcs.InfinityDTH.Dao.UserDao;
import com.tcs.InfinityDTH.Model.InventoryDetails;
import com.tcs.InfinityDTH.Model.StbDetails;
import com.tcs.InfinityDTH.Model.UserDetails;


public class UserService {
	
	public UserDetails checkUser(String userName, String password)
	{
		UserDao user = new UserDao() ;
		UserDetails temp =  user.checkUser(userName, password);
		return  temp;
	}
	
	public ArrayList<InventoryDetails> getStbDetails(String stbType) throws Exception
	{
		UserDao user = new UserDao();
		return user.getStbDetails(stbType);
	}
	
	public  ArrayList<StbDetails> getStbPriceDetails(String stbType,String billtype) throws Exception 
	{
		UserDao user = new UserDao();
		return user.getStbPriceDetails(stbType,billtype);
	}
	
	public int addPurchaseStb(double tax, int stbId, int userID, String userName)
	{
		UserDao user = new UserDao();
		return user.addPurchasedStb(tax,stbId,userID, userName);
	}
	
	
	
}
