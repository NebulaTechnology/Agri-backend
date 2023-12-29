
package com.nebula.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Data
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
        private List<Bill> bills;

        private Double totalPaid;
        private Double totalRemaining;
}
