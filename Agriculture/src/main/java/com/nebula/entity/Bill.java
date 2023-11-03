package com.nebula.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="BILL")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billNo;
    private long custId;
    private long[] itemId;
    private String[] batchId;
    private String[] prodExpiry;
    private int[] productQauntity;
    private double[] productCGST;
    private double[] productAGST;
    private double[] productIGST;
    private String[] productHSN;
    private String[] productCompany;
    private double csgt;
    private double sgst;
    private double igst;
    private double totalAmmount;
    private double paidAmmount;
    private double remainingAmmount;

}
