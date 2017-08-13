package com.tcs.InfinityDTH.Model;


public class InventoryDetails {
	private String inventoryType;
	private String inventoryMac;
	private String inventorySerial;
	
	public InventoryDetails(String inventoryType, String inventoryMac, String inventorySerial) {
		
		this.inventoryType = inventoryType;
		this.inventoryMac = inventoryMac;
		this.inventorySerial = inventorySerial;
	}
	public InventoryDetails()
	{
	
	}
	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getInventoryMac() {
		return inventoryMac;
	}

	public void setInventoryMac(String inventoryMac) {
		this.inventoryMac = inventoryMac;
	}

	public String getInventorySerial() {
		return inventorySerial;
	}

	public void setInventorySerial(String inventorySerial) {
		this.inventorySerial = inventorySerial;
	}
	
	
}