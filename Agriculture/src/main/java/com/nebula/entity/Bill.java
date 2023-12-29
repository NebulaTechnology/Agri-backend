package com.nebula.entity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billNo;

    @Column(name = "customer_id")
    private Long custId;

    private Long[] itemId;

    private String[] batchNum;

    private String[] prodExpiry;

    private Integer[] productQuantity;

    private Double[] productCGST;

    private Double[] productAGST;

    private Double[] productIGST;

    private String[] productHSN;


    private String[] productCompany;

    private Double csgt;

    private Double sgst;

    private Double igst;

    private Double totalAmmount;

    private Double paidAmmount;

    private Double remainingAmmount;
}
