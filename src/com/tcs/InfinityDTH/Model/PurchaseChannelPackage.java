package com.tcs.InfinityDTH.Model;

import java.sql.Date;

public class PurchaseChannelPackage {
private int userid;
private String username;
private int packageid;
private Date startdate;
private Date enddate;
private int activenumber;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPackageid() {
	return packageid;
}
public void setPackageid(int packageid) {
	this.packageid = packageid;
}
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}
public Date getEnddate() {
	return enddate;
}
public void setEnddate(Date enddate) {
	this.enddate = enddate;
}
public int getActivenumber() {
	return activenumber;
}
public void setActivenumber(int activenumber) {
	this.activenumber = activenumber;
}
}
