package com.nebula.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@RequiredArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private String batch;
    private String expiry;
    private Integer quantity;
    private Double rate;
    private Double netRate;
    private Double offerRate;
    private Double cgst;
    private Double sgst;
    private Double igst;
    private String hsn;

    private Long billNo;


}