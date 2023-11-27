package com.nebula.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
    private String itemName;
    private String batch;
    private String expiry;
    private int quantity;
    private double rate;
    private double netRate;
    private double offerRate;
    private double cgst;
    private double sgst;
    private double igst;
    private String hsn;
	public void setItemId(Long itemId2) {
		// TODO Auto-generated method stub
		
	}
	public Item(Long itemId, String itemName, String batch, String expiry, int quantity, double rate, double netRate,
			double offerRate, double cgst, double sgst, double igst, String hsn) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.batch = batch;
		this.expiry = expiry;
		this.quantity = quantity;
		this.rate = rate;
		this.netRate = netRate;
		this.offerRate = offerRate;
		this.cgst = cgst;
		this.sgst = sgst;
		this.igst = igst;
		this.hsn = hsn;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", batch=" + batch + ", expiry=" + expiry
				+ ", quantity=" + quantity + ", rate=" + rate + ", netRate=" + netRate + ", offerRate=" + offerRate
				+ ", cgst=" + cgst + ", sgst=" + sgst + ", igst=" + igst + ", hsn=" + hsn + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getNetRate() {
		return netRate;
	}
	public void setNetRate(double netRate) {
		this.netRate = netRate;
	}
	public double getOfferRate() {
		return offerRate;
	}
	public void setOfferRate(double offerRate) {
		this.offerRate = offerRate;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getIgst() {
		return igst;
	}
	public void setIgst(double igst) {
		this.igst = igst;
	}
	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public Long getItemId() {
		return itemId;
	}
	

}
