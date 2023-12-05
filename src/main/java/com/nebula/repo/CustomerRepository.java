package com.nebula.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nebula.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}