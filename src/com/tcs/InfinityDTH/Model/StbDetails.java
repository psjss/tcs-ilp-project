package com.tcs.InfinityDTH.Model;

public class StbDetails
{
	
	private int stbId;
	private String stbType;
//	private int length;
//	private int width;
//	private int breadth;
	private int price;
	private int installationCharges;
	private int updationCharges;
	private String serialNumber;
	private int discount;
	private int deposit;
	private double tax;
	private double totalCost;
	
	public StbDetails(int stbId, String stbType, int price,
			int installationCharges, int updationCharges, String serialNumber,
			int discount, int deposit, double tax, double totalCost) {
		super();
		this.stbId = stbId;
		this.stbType = stbType;
		this.price = price;
		this.installationCharges = installationCharges;
		this.updationCharges = updationCharges;
		this.serialNumber = serialNumber;
		this.discount = discount;
		this.deposit = deposit;
		this.tax = tax;
		this.totalCost = totalCost;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	
	
	public StbDetails()
	{
		
	}
	public int getStbId() {
		return stbId;
	}
	public void setStbId(int stbId) {
		this.stbId = stbId;
	}
	public String getStbType() {
		return stbType;
	}
	public void setStbType(String stbType) {
		this.stbType = stbType;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInstallationCharges() {
		return installationCharges;
	}
	public void setInstallationCharges(int installationCharges) {
		this.installationCharges = installationCharges;
	}
	public int getUpdationCharges() {
		return updationCharges;
	}
	public void setUpdationCharges(int updationCharges) {
		this.updationCharges = updationCharges;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	
	
}
