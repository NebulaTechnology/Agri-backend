package com.nebula.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vId;

    private String name;

    private String address;

    private String email;

    private String gstInvoice;

    private String pan;

    private String fertilizerRLicenseNumber;

    private String fertilizerWLicenseNumber;

    private String pesticideLicenseNumber;

    private String seedLicenseNumber;

    private String pincode;

    private String contact;

    public Vendor(Long vId, String name, String address, String email, String gstInvoice, String pan,
                  String fertilizerRLicenseNumber, String fertilizerWLicenseNumber, String pesticideLicenseNumber,
                  String seedLicenseNumber, String pincode, String contact) {
        super();
        this.vId = vId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.gstInvoice = gstInvoice;
        this.pan = pan;
        this.fertilizerRLicenseNumber = fertilizerRLicenseNumber;
        this.fertilizerWLicenseNumber = fertilizerWLicenseNumber;
        this.pesticideLicenseNumber = pesticideLicenseNumber;
        this.seedLicenseNumber = seedLicenseNumber;
        this.pincode = pincode;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Vendor [vId=" + vId + ", name=" + name + ", address=" + address + ", email=" + email + ", gstInvoice="
                + gstInvoice + ", pan=" + pan + ", fertilizerRLicenseNumber=" + fertilizerRLicenseNumber
                + ", fertilizerWLicenseNumber=" + fertilizerWLicenseNumber + ", pesticideLicenseNumber="
                + pesticideLicenseNumber + ", seedLicenseNumber=" + seedLicenseNumber + ", pincode=" + pincode
                + ", contact=" + contact + "]";
    }

    public Long getvId() {
        return vId;
    }

    public void setvId(Long vId) {
        this.vId = vId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGstInvoice() {
        return gstInvoice;
    }

    public void setGstInvoice(String gstInvoice) {
        this.gstInvoice = gstInvoice;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getFertilizerRLicenseNumber() {
        return fertilizerRLicenseNumber;
    }

    public void setFertilizerRLicenseNumber(String fertilizerRLicenseNumber) {
        this.fertilizerRLicenseNumber = fertilizerRLicenseNumber;
    }

    public String getFertilizerWLicenseNumber() {
        return fertilizerWLicenseNumber;
    }

    public void setFertilizerWLicenseNumber(String fertilizerWLicenseNumber) {
        this.fertilizerWLicenseNumber = fertilizerWLicenseNumber;
    }

    public String getPesticideLicenseNumber() {
        return pesticideLicenseNumber;
    }

    public void setPesticideLicenseNumber(String pesticideLicenseNumber) {
        this.pesticideLicenseNumber = pesticideLicenseNumber;
    }

    public String getSeedLicenseNumber() {
        return seedLicenseNumber;
    }

    public void setSeedLicenseNumber(String seedLicenseNumber) {
        this.seedLicenseNumber = seedLicenseNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Vendor() {
        super();
        // TODO Auto-generated constructor stub
    }
}