package com.tcs.InfinityDTH.Model;

public class PackDetails {
	private int packId;
	private String packName;
	private String category;
	private String pct;
	private String transmissionType;
	private int price;
	private int availableChannels;
	private int duration;
	public PackDetails(int packId, String packName, String category,
			String pct, String transmissionType, int price,
			int availableChannels, int duration) {
		super();
		this.packId = packId;
		this.packName = packName;
		this.category = category;
		this.pct = pct;
		this.transmissionType = transmissionType;
		this.price = price;
		this.availableChannels = availableChannels;
		this.duration = duration;
	}
	public int getPackId() {
		return packId;
	}
	public void setPackId(int packId) {
		this.packId = packId;
	}
	public String getPackName() {
		return packName;
	}
	public void setPackName(String packName) {
		this.packName = packName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPct() {
		return pct;
	}
	public void setPct(String pct) {
		this.pct = pct;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableChannels() {
		return availableChannels;
	}
	public void setAvailableChannels(int availableChannels) {
		this.availableChannels = availableChannels;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
