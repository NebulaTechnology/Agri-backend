package com.nebula.entity;

import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invId;

    @ManyToOne
    @JoinColumn(name = "vId")
    private Vendor vendor;

    private String invNumber;

    private String invDate;

    private String dispatch;

    private int totalItem;

    private String[] packingItemName;

    private String[] hsn;

    private String[] gst;

    private String[] company;

    private String[] batchNo;

    private String[] expiryDate;

    private Integer[] quantity;

    private Double[] rate;

    private Double[] netRate;

    private double amount;

    private double cgst;

    private double sgst;

    private double igst;

    private double other;

    private double totalAmount;

}
