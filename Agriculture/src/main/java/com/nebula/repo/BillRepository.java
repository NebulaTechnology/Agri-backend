package com.nebula.repo;

import com.nebula.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
