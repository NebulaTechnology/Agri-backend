package com.nebula.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@Data
public class User {
    @Id
    private String userName;
    private String password;
}
