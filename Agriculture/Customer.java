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
	public Customer(Long customerId, String customerName, String mobile, String address, String pinCode, String email,
			String aadhar, double totalPaid, double totalRemaining) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
		this.address = address;
		this.pinCode = pinCode;
		this.email = email;
		this.aadhar = aadhar;
		this.totalPaid = totalPaid;
		this.totalRemaining = totalRemaining;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobile=" + mobile
				+ ", address=" + address + ", pinCode=" + pinCode + ", email=" + email + ", aadhar=" + aadhar
				+ ", totalPaid=" + totalPaid + ", totalRemaining=" + totalRemaining + "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	public double getTotalRemaining() {
		return totalRemaining;
	}
	public void setTotalRemaining(double totalRemaining) {
		this.totalRemaining = totalRemaining;
	}
	public Long getCustomerId() {
		return customerId;
	}
}
