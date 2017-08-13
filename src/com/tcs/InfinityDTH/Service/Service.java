package com.tcs.InfinityDTH.Service;


import java.sql.SQLException;
import java.util.ArrayList;

import com.tcs.InfinityDTH.Dao.DAO;

import com.tcs.InfinityDTH.Model.GenerateBill;
public class Service 
{
	public ArrayList<GenerateBill> getDetails() throws ClassNotFoundException, SQLException
	{
		DAO d = new DAO();
		return d.getDetails();
	}
	public ArrayList<GenerateBill>  getDetails1() throws SQLException
	{
		DAO d = new DAO();
		return d.getDetails1();
	}
}
