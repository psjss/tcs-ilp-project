package com.tcs.InfinityDTH.Model;

public class GenerateBill 
{
		private String billGenerationDate,billPaymentDate;
		private String customer_name,stb_type;
		private String package_name,package_cost;
		private String installation,extra_charges;
		private String total_amount,discount;
		private String refundable_amount,final_amount,cust_id,channel_id;
		
		public String getPackage_cost() {
			return package_cost;
		}
		public void setPackage_cost(String package_cost) {
			this.package_cost = package_cost;
		}
		public String getCust_id() {
			return cust_id;
		}
		public void setCust_id(String cust_id) {
			this.cust_id = cust_id;
		}
		public void setTotal_amount(String total_amount) {
			this.total_amount = total_amount;
		}
		public GenerateBill(String a1, String a2, String a3, String a4,
				String a5, String a6,String a7,String a8,String a9) {
			// TODO Auto-generated constructor stub
			customer_name=a2;
			stb_type=a3;
			setChannel_id(a5);
			package_name=a6;
			//package_cost=a4;
			cust_id=a1;
			total_amount=a4;
			billGenerationDate= a7;
			billPaymentDate= a8;
			final_amount=a9;
			
		}
		public GenerateBill(String a1, String a2, String a3, String a4,
				String a5, String a6,String a7,String a8) {
			// TODO Auto-generated constructor stub
			customer_name=a2;
			stb_type=a3;
			setChannel_id(a5);
			package_name=a6;
			//package_cost=a4;
			cust_id=a1;
			total_amount=a4;
			billGenerationDate= a7;
			billPaymentDate= a8;
			//final_amount=a9;
			
		}
		public String getBillGenerationDate() 
		{
			return billGenerationDate;
		}
		public void setBillGenerationDate(String billGenerationDate) 
		{
			this.billGenerationDate = billGenerationDate;
		}
		public String getBillPaymentDate() 
		{
			return billPaymentDate;
		}
		public void setBillPaymentDate(String billPayementDate) 
		{
			this.billPaymentDate = billPayementDate;
		}
		public String getCustomer_name()
		{
			return customer_name;
		}
		public void setCustomer_name(String customer_name) 
		{
			this.customer_name = customer_name;
		}
		public String getStb_type() 
		{
			return stb_type;
		}
		public void setStb_type(String stb_type) 
		{
			this.stb_type = stb_type;
		}
		public String getPackage_name() {
			return package_name;
		}
		public void setPackage_name(String package_name) {
			this.package_name = package_name;
		}
		public String getPackage_Cost() {
			return package_cost;
		}
		public void setPackage_Cost(String cost) {
			this.package_cost = cost;
		}
		public String getInstallation() {
			return installation;
		}
		public void setInstallation(String installation) {
			this.installation = installation;
		}
		public String getExtra_charges() {
			return extra_charges;
		}
		public void setExtra_charges(String extra_charges) {
			this.extra_charges = extra_charges;
		}
		public String getTotal_amount() {
			return total_amount;
		}
		public void setTotal_cost(String total_amount) {
			this.total_amount = total_amount;
		}
		public String getDiscount() {
			return discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getRefundable_amount() {
			return refundable_amount;
		}
		public void setRefundable_amount(String refundable_amount) {
			this.refundable_amount = refundable_amount;
		}
		public String getFinal_amount() {
			return final_amount;
		}
		public void setFinal_amount(String final_amount) {
			this.final_amount = final_amount;
		}
		public String getChannel_id() {
			return channel_id;
		}
		public void setChannel_id(String channel_id) {
			this.channel_id = channel_id;
		}
		
	}

