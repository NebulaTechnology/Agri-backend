package com.nebula.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String mobile;
    private String address;
    private String pinCode;
    private String email;
    private String aadhar;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    //private List<Bill> bills = new ArrayList<>();

    private double totalPaid;
    private double totalRemaining;
	public void setCustomerId(Long customerId2) {
		// TODO Auto-generated method stub
		
	}
}
