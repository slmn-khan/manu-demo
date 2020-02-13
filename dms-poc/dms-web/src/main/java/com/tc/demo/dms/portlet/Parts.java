package com.tc.demo.dms.portlet;

public class Parts {
	
	public int partAmount;
	public String id;
	public String partNumber;
	public String partDesc;
	public String pricePerUnit;
	public String partQuantity;
	public int getPartAmount() {
		return partAmount;
	}
	public void setPartAmount(int partAmount) {
		this.partAmount = partAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public String getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getPartQuantity() {
		return partQuantity;
	}
	public void setPartQuantity(String partQuantity) {
		this.partQuantity = partQuantity;
	}
	@Override
	public String toString() {
		return "Parts [partAmount=" + partAmount + ", id=" + id + ", partNumber=" + partNumber + ", partDesc="
				+ partDesc + ", pricePerUnit=" + pricePerUnit + ", partQuantity=" + partQuantity + "]";
	}
	
	
	
	

}
