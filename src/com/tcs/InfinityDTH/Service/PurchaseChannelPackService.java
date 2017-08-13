package com.tcs.InfinityDTH.Service;


import com.tcs.InfinityDTH.Dao.PurchaseChannelPackDao;


public class PurchaseChannelPackService {
	
	public int check(int stbid,int userid,String billingtype)
	{
		PurchaseChannelPackDao d = new PurchaseChannelPackDao();
		System.out.println("inside service");
		return d.check(stbid,userid,billingtype);
	}
	
	public int addPack(String []a,int id)
	{
		PurchaseChannelPackDao d = new PurchaseChannelPackDao();
		return d.addPack(a,id);
	}
	public int channelPrice(String[] a,int id)
	{
		PurchaseChannelPackDao d = new PurchaseChannelPackDao();
		return d.channelPrice(a,id);
	}
	public int update(int a,int b)
	{
		PurchaseChannelPackDao d = new PurchaseChannelPackDao();
		 return d.update(a,b);
	}
}
