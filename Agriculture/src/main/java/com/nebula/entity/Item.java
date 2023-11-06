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
	

}
